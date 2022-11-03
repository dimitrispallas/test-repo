/* Copyright (c) 2011 Danish Maritime Authority.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dk.dma.ais.configuration.filter;

import javax.xml.bind.annotation.XmlRootElement;

import dk.dma.ais.configuration.transform.PacketTaggingConfiguration;
import dk.dma.ais.filter.IPacketFilter;
import dk.dma.ais.filter.TaggingFilter;

/**
 * The type Tagging filter configuration.
 */
@XmlRootElement
public class TaggingFilterConfiguration extends FilterConfiguration {
    
    private PacketTaggingConfiguration filterTagging = new PacketTaggingConfiguration();

    /**
     * Instantiates a new Tagging filter configuration.
     */
    public TaggingFilterConfiguration() {
        
    }

    /**
     * Gets filter tagging.
     *
     * @return the filter tagging
     */
    public PacketTaggingConfiguration getFilterTagging() {
        return filterTagging;
    }

    /**
     * Sets filter tagging.
     *
     * @param filterTagging the filter tagging
     */
    public void setFilterTagging(PacketTaggingConfiguration filterTagging) {
        this.filterTagging = filterTagging;
    }

    @Override
    public IPacketFilter getInstance() {
        return new TaggingFilter(filterTagging.getInstance());
    }

}
