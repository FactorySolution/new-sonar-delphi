/*
 * Sonar Delphi Plugin
 * Copyright (C) 2019 Integrated Application Development
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
package au.com.integradev.delphi.msbuild.condition;

import au.com.integradev.delphi.msbuild.expression.ExpressionEvaluator;
import java.util.Optional;

public interface Expression {
  default Optional<Boolean> boolEvaluate(ExpressionEvaluator evaluator) {
    return Optional.empty();
  }

  default Optional<Double> numericEvaluate(ExpressionEvaluator evaluator) {
    return Optional.empty();
  }

  default Optional<Version> versionEvaluate(ExpressionEvaluator evaluator) {
    return Optional.empty();
  }

  default Optional<String> getValue() {
    return Optional.empty();
  }

  default Optional<String> getExpandedValue(ExpressionEvaluator evaluator) {
    return Optional.empty();
  }
}
