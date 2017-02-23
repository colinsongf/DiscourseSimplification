/*
 * ==========================License-Start=============================
 * DiscourseSimplification : DiscourseCoreCoreRelation
 *
 * Copyright © 2017 Lambda³
 *
 * GNU General Public License 3
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 * ==========================License-End==============================
 */

package org.lambda3.text.simplification.discourse.relation_extraction.relation;

import org.lambda3.text.simplification.discourse.relation_extraction.element.DiscourseCore;
import org.lambda3.text.simplification.discourse.tree.Relation;

/**
 *
 */
public class DiscourseCoreCoreRelation {
    private final Relation relation;
    private final DiscourseCore core;

    public DiscourseCoreCoreRelation(Relation relation, DiscourseCore core) {
        this.relation = relation;
        this.core = core;
    }

    public Relation getRelation() {
        return relation;
    }

    public DiscourseCore getCore() {
        return core;
    }

    @Override
    public boolean equals(Object o) {
        return ((o instanceof DiscourseCoreCoreRelation)
                && (((DiscourseCoreCoreRelation) o).relation.equals(relation))
                && (((DiscourseCoreCoreRelation) o).core.equals(core)));
    }
}
