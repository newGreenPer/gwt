/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental.svg;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.stylesheets.*;

import java.util.Date;

/**
  * The <code>SVGEllipseElement</code> interface provides access to the properties of <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/ellipse">&lt;ellipse&gt;</a></code>
 elements, as well as methods to manipulate them.
  */
public interface SVGEllipseElement extends SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {


  /**
    * Corresponds to attribute 
<code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Attribute/cx">cx</a></code> on the given <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/ellipse">&lt;ellipse&gt;</a></code>
 element.
    */
  SVGAnimatedLength getCx();


  /**
    * Corresponds to attribute 
<code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Attribute/cy">cy</a></code> on the given <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/ellipse">&lt;ellipse&gt;</a></code>
 element.
    */
  SVGAnimatedLength getCy();


  /**
    * Corresponds to attribute 
<code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Attribute/rx">rx</a></code> on the given <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/ellipse">&lt;ellipse&gt;</a></code>
 element.
    */
  SVGAnimatedLength getRx();


  /**
    * Corresponds to attribute 
<code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Attribute/ry">ry</a></code> on the given <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/ellipse">&lt;ellipse&gt;</a></code>
 element.
    */
  SVGAnimatedLength getRy();
}