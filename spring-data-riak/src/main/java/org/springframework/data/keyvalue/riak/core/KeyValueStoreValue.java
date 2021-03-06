/*
 * Copyright (c) 2010 by J. Brisbin <jon@jbrisbin.com>
 *     Portions (c) 2010 by NPC International, Inc. or the
 *     original author(s).
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

package org.springframework.data.keyvalue.riak.core;

/**
 * A generic interface for dealing with values and their store metadata.
 *
 * @author J. Brisbin <jon@jbrisbin.com>
 */
public interface KeyValueStoreValue<T> {

  /**
   * Get the metadata associated with this value.
   *
   * @return
   */
  KeyValueStoreMetaData getMetaData();

  /**
   * Get the converted value itself.
   *
   * @return
   */
  T get();

}
