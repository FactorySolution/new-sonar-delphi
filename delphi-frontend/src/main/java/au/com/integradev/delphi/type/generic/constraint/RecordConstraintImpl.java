/*
 * Sonar Delphi Plugin
 * Copyright (C) 2025 Integrated Application Development
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package au.com.integradev.delphi.type.generic.constraint;

import org.sonar.plugins.communitydelphi.api.type.Constraint.RecordConstraint;
import org.sonar.plugins.communitydelphi.api.type.Type;

public class RecordConstraintImpl extends ConstraintImpl implements RecordConstraint {
  private static final RecordConstraintImpl INSTANCE = new RecordConstraintImpl();

  private RecordConstraintImpl() {
    // Hide constructor
  }

  @Override
  protected ConstraintCheckResult check(Type type) {
    if (type.isRecord()
        || type.isBoolean()
        || type.isReal()
        || type.isInteger()
        || type.isEnum()
        || type.isSubrange()
        || type.isChar()) {
      return ConstraintCheckResult.SATISFIED;
    } else {
      return ConstraintCheckResult.VIOLATED;
    }
  }

  @Override
  protected ConstraintCheckResult check(ClassConstraint constraint) {
    return ConstraintCheckResult.VIOLATED;
  }

  @Override
  protected ConstraintCheckResult check(ConstructorConstraint constraint) {
    return ConstraintCheckResult.VIOLATED;
  }

  @Override
  protected ConstraintCheckResult check(RecordConstraint constraint) {
    return ConstraintCheckResult.SATISFIED;
  }

  public static RecordConstraintImpl instance() {
    return INSTANCE;
  }
}
