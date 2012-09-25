/*
 * Copyright (C) 2011 Benoit GUEROUT <bguerout at gmail dot com> and Yves AMSELLEM <amsellem dot yves at gmail dot com>
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

package org.jongo.bson;

import com.mongodb.DBObject;
import com.mongodb.LazyWriteableDBObject;
import org.bson.LazyBSONCallback;

class LazyBsonDocument extends LazyWriteableDBObject implements BsonDocument {

    LazyBsonDocument(byte[] data, int offset, LazyBSONCallback cbk) {
        super(data, offset, cbk);
    }

    public int getSize() {
        return getBSONSize();
    }

    public byte[] toByteArray() {
        return _input.array();
    }

    public DBObject toDBObject() {
        return this;
    }
}
