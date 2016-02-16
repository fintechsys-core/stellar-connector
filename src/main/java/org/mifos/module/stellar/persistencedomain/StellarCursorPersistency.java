/**
 * Copyright 2016 Myrle Krantz
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
package org.mifos.module.stellar.persistencedomain;

import javax.persistence.*;

@Entity
@Table(name = "stellar_cursor")
public class StellarCursorPersistency {

  @SuppressWarnings("unused")
  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "cursor")
  private String cursor;

  @SuppressWarnings("unused")
  @Column(name = "processed")
  private Boolean processed;

  public StellarCursorPersistency(final String cursor) {
    this.cursor = cursor;
    this.processed = false;
  }

  public String getCursor() {
    return cursor;
  }

  public void setProcessed(Boolean processed) {
    this.processed = processed;
  }
}
