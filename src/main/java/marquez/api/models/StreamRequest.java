/*
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

package marquez.api.models;

import static marquez.common.models.DatasetType.STREAM;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import javax.annotation.Nullable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import marquez.common.models.Field;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class StreamRequest extends DatasetRequest {
  @Getter private final String schemaLocation;

  @JsonCreator
  public StreamRequest(
      final String physicalName,
      final String sourceName,
      final String schemaLocation,
      @Nullable final List<Field> fields,
      @Nullable final List<String> tags,
      @Nullable final String description,
      @Nullable final String runId) {
    super(STREAM, physicalName, sourceName, fields, tags, description, runId);
    this.schemaLocation = schemaLocation;
  }
}
