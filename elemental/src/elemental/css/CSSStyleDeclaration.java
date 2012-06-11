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
package elemental.css;
import elemental.dom.*;
import elemental.html.*;

/**
  * $CLASS_JAVADOC
  */
public interface CSSStyleDeclaration {


  /**
    *  Textual representation of the declaration block. Setting this attribute changes the style.
    */
  String getCssText();

  void setCssText(String arg);


  /**
    *  The number of properties. See the <strong>item</strong> method below.
    */
  int getLength();


  /**
    *  The containing <code><a href="https://developer.mozilla.org/en/DOM/cssRule" rel="internal" title="en/DOM/cssRule">cssRule</a>.</code>
    */
  CSSRule getParentRule();


  /**
    * <span>Only supported via getComputedStyle.<br> </span>Returns a <a class="external" title="http://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSValue" rel="external" href="http://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSValue" target="_blank">CSSValue</a>, or <code>null</code> for <a title="en/Guide to Shorthand CSS" rel="internal" href="https://developer.mozilla.org/en/Guide_to_Shorthand_CSS">Shorthand properties</a>.<br> Example: <em>cssString</em>= window.getComputedStyle(<em>elem</em>, <code>null</code>).getPropertyCSSValue('color').cssText;<br> Note: Gecko 1.9 returns null unless using <a title="en/DOM/window.getComputedStyle" rel="internal" href="https://developer.mozilla.org/en/DOM/window.getComputedStyle">getComputedStyle()</a>.<br> Note: this method may be <a class="external" title="http://lists.w3.org/Archives/Public/www-style/2003Oct/0347.html" rel="external" href="http://lists.w3.org/Archives/Public/www-style/2003Oct/0347.html" target="_blank">deprecated by the W3C</a>.
    */
  CSSValue getPropertyCSSValue(String propertyName);


  /**
    *  Returns the optional priority, "important".<br> Example: <em>priString</em>= <em>styleObj</em>.getPropertyPriority('color')
    */
  String getPropertyPriority(String propertyName);

  String getPropertyShorthand(String propertyName);


  /**
    *  Returns the property value.<br> Example: <em>valString</em>= <em>styleObj</em>.getPropertyValue('color')
    */
  String getPropertyValue(String propertyName);

  boolean isPropertyImplicit(String propertyName);


  /**
    *  Returns a property name.<br> Example: <em>nameString</em>= <em>styleObj</em>.item(0)<br> Alternative: <em>nameString</em>= <em>styleObj</em>[0]
    */
  String item(int index);


  /**
    *  Returns the value deleted.<br> Example: <em>valString</em>= <em>styleObj</em>.removeProperty('color')
    */
  String removeProperty(String propertyName);


  /**
    *  No return.<br> Example: <em>styleObj</em>.setProperty('color', 'red', 'important')
    */
  void setProperty(String propertyName, String value);


  /**
    *  No return.<br> Example: <em>styleObj</em>.setProperty('color', 'red', 'important')
    */
  void setProperty(String propertyName, String value, String priority);

public interface Unit {
  public static final String PX = "px";
  public static final String PCT = "%";
  public static final String EM = "em";
  public static final String EX = "ex";
  public static final String PT = "pt";
  public static final String PC = "pc";
  public static final String IN = "in";
  public static final String CM = "cm";
  public static final String MM = "mm";
}

String getColor();
void setColor(String value);
void clearColor();
String getDirection();
void setDirection(String value);
void clearDirection();

public interface Display {
  public static final String NONE = "none";
  public static final String BLOCK = "block";
  public static final String INLINE = "inline";
  public static final String INLINE_BLOCK = "inline-block";
}

String getDisplay();
void setDisplay(String value);
void clearDisplay();
String getFont();
void setFont(String value);
void clearFont();
String getFontFamily();
void setFontFamily(String value);
void clearFontFamily();
String getFontSize();
void setFontSize(String value);
void clearFontSize();
void setFontSize(double value, String unit);

public interface FontStyle {
  public static final String NORMAL = "normal";
  public static final String ITALIC = "italic";
  public static final String OBLIQUE = "oblique";
}

String getFontStyle();
void setFontStyle(String value);
void clearFontStyle();

public interface FontWeight {
  public static final String NORMAL = "normal";
  public static final String BOLD = "bold";
  public static final String BOLDER = "bolder";
  public static final String LIGHTER = "lighter";
}

String getFontWeight();
void setFontWeight(String value);
void clearFontWeight();
String getFontVariant();
void setFontVariant(String value);
void clearFontVariant();
String getTextRendering();
void setTextRendering(String value);
void clearTextRendering();
String getWebkitFontFeatureSettings();
void setWebkitFontFeatureSettings(String value);
void clearWebkitFontFeatureSettings();
String getWebkitFontKerning();
void setWebkitFontKerning(String value);
void clearWebkitFontKerning();
String getWebkitFontSmoothing();
void setWebkitFontSmoothing(String value);
void clearWebkitFontSmoothing();
String getWebkitFontVariantLigatures();
void setWebkitFontVariantLigatures(String value);
void clearWebkitFontVariantLigatures();
String getWebkitLocale();
void setWebkitLocale(String value);
void clearWebkitLocale();
String getWebkitTextOrientation();
void setWebkitTextOrientation(String value);
void clearWebkitTextOrientation();
String getWebkitTextSizeAdjust();
void setWebkitTextSizeAdjust(String value);
void clearWebkitTextSizeAdjust();
String getWebkitWritingMode();
void setWebkitWritingMode(String value);
void clearWebkitWritingMode();
String getZoom();
void setZoom(String value);
void clearZoom();
String getLineHeight();
void setLineHeight(String value);
void clearLineHeight();
String getBackground();
void setBackground(String value);
void clearBackground();
String getBackgroundAttachment();
void setBackgroundAttachment(String value);
void clearBackgroundAttachment();
String getBackgroundClip();
void setBackgroundClip(String value);
void clearBackgroundClip();
String getBackgroundColor();
void setBackgroundColor(String value);
void clearBackgroundColor();
String getBackgroundImage();
void setBackgroundImage(String value);
void clearBackgroundImage();
String getBackgroundOrigin();
void setBackgroundOrigin(String value);
void clearBackgroundOrigin();
String getBackgroundPosition();
void setBackgroundPosition(String value);
void clearBackgroundPosition();
String getBackgroundPositionX();
void setBackgroundPositionX(String value);
void clearBackgroundPositionX();
String getBackgroundPositionY();
void setBackgroundPositionY(String value);
void clearBackgroundPositionY();
String getBackgroundRepeat();
void setBackgroundRepeat(String value);
void clearBackgroundRepeat();
String getBackgroundRepeatX();
void setBackgroundRepeatX(String value);
void clearBackgroundRepeatX();
String getBackgroundRepeatY();
void setBackgroundRepeatY(String value);
void clearBackgroundRepeatY();
String getBackgroundSize();
void setBackgroundSize(String value);
void clearBackgroundSize();
String getBorder();
void setBorder(String value);
void clearBorder();
String getBorderBottom();
void setBorderBottom(String value);
void clearBorderBottom();
String getBorderBottomColor();
void setBorderBottomColor(String value);
void clearBorderBottomColor();
String getBorderBottomLeftRadius();
void setBorderBottomLeftRadius(String value);
void clearBorderBottomLeftRadius();
String getBorderBottomRightRadius();
void setBorderBottomRightRadius(String value);
void clearBorderBottomRightRadius();
String getBorderBottomStyle();
void setBorderBottomStyle(String value);
void clearBorderBottomStyle();
String getBorderBottomWidth();
void setBorderBottomWidth(String value);
void clearBorderBottomWidth();
String getBorderCollapse();
void setBorderCollapse(String value);
void clearBorderCollapse();
String getBorderColor();
void setBorderColor(String value);
void clearBorderColor();
String getBorderImage();
void setBorderImage(String value);
void clearBorderImage();
String getBorderImageOutset();
void setBorderImageOutset(String value);
void clearBorderImageOutset();
String getBorderImageRepeat();
void setBorderImageRepeat(String value);
void clearBorderImageRepeat();
String getBorderImageSlice();
void setBorderImageSlice(String value);
void clearBorderImageSlice();
String getBorderImageSource();
void setBorderImageSource(String value);
void clearBorderImageSource();
String getBorderImageWidth();
void setBorderImageWidth(String value);
void clearBorderImageWidth();
String getBorderLeft();
void setBorderLeft(String value);
void clearBorderLeft();
String getBorderLeftColor();
void setBorderLeftColor(String value);
void clearBorderLeftColor();
String getBorderLeftStyle();
void setBorderLeftStyle(String value);
void clearBorderLeftStyle();
String getBorderLeftWidth();
void setBorderLeftWidth(String value);
void clearBorderLeftWidth();
String getBorderRadius();
void setBorderRadius(String value);
void clearBorderRadius();
String getBorderRight();
void setBorderRight(String value);
void clearBorderRight();
String getBorderRightColor();
void setBorderRightColor(String value);
void clearBorderRightColor();
String getBorderRightStyle();
void setBorderRightStyle(String value);
void clearBorderRightStyle();
String getBorderRightWidth();
void setBorderRightWidth(String value);
void clearBorderRightWidth();
String getBorderSpacing();
void setBorderSpacing(String value);
void clearBorderSpacing();

public interface BorderStyle {
  public static final String NONE = "none";
  public static final String HIDDEN = "hidden";
  public static final String DOTTED = "dotted";
  public static final String DASHED = "dashed";
  public static final String SOLID = "solid";
}

String getBorderStyle();
void setBorderStyle(String value);
void clearBorderStyle();
String getBorderTop();
void setBorderTop(String value);
void clearBorderTop();
String getBorderTopColor();
void setBorderTopColor(String value);
void clearBorderTopColor();
String getBorderTopLeftRadius();
void setBorderTopLeftRadius(String value);
void clearBorderTopLeftRadius();
String getBorderTopRightRadius();
void setBorderTopRightRadius(String value);
void clearBorderTopRightRadius();
String getBorderTopStyle();
void setBorderTopStyle(String value);
void clearBorderTopStyle();
String getBorderTopWidth();
void setBorderTopWidth(String value);
void clearBorderTopWidth();
String getBorderWidth();
void setBorderWidth(String value);
void clearBorderWidth();
void setBorderWidth(double value, String unit);
String getBottom();
void setBottom(String value);
void clearBottom();
void setBottom(double value, String unit);
String getBoxShadow();
void setBoxShadow(String value);
void clearBoxShadow();
String getBoxSizing();
void setBoxSizing(String value);
void clearBoxSizing();
String getCaptionSide();
void setCaptionSide(String value);
void clearCaptionSide();
String getClear();
void setClear(String value);
void clearClear();
String getClip();
void setClip(String value);
void clearClip();
String getContent();
void setContent(String value);
void clearContent();
String getCounterIncrement();
void setCounterIncrement(String value);
void clearCounterIncrement();
String getCounterReset();
void setCounterReset(String value);
void clearCounterReset();

public interface Cursor {
  public static final String DEFAULT = "default";
  public static final String AUTO = "auto";
  public static final String CROSSHAIR = "crosshair";
  public static final String POINTER = "pointer";
  public static final String MOVE = "move";
  public static final String E_RESIZE = "e-resize";
  public static final String NE_RESIZE = "ne-resize";
  public static final String NW_RESIZE = "nw-resize";
  public static final String N_RESIZE = "n-resize";
  public static final String SE_RESIZE = "se-resize";
  public static final String SW_RESIZE = "sw-resize";
  public static final String S_RESIZE = "s-resize";
  public static final String W_RESIZE = "w-resize";
  public static final String TEXT = "text";
  public static final String WAIT = "wait";
  public static final String HELP = "help";
  public static final String COL_RESIZE = "col-resize";
  public static final String ROW_RESIZE = "row-resize";
}

String getCursor();
void setCursor(String value);
void clearCursor();
String getEmptyCells();
void setEmptyCells(String value);
void clearEmptyCells();
String getFloat();
void setFloat(String value);
void clearFloat();
String getFontStretch();
void setFontStretch(String value);
void clearFontStretch();
String getHeight();
void setHeight(String value);
void clearHeight();
void setHeight(double value, String unit);
String getImageRendering();
void setImageRendering(String value);
void clearImageRendering();
String getLeft();
void setLeft(String value);
void clearLeft();
void setLeft(double value, String unit);
String getLetterSpacing();
void setLetterSpacing(String value);
void clearLetterSpacing();
String getListStyle();
void setListStyle(String value);
void clearListStyle();

public interface ListStyleType {
  public static final String NONE = "none";
  public static final String DISC = "disc";
  public static final String CIRCLE = "circle";
  public static final String SQUARE = "square";
  public static final String DECIMAL = "decimal";
  public static final String LOWER_ALPHA = "lower-alpha";
  public static final String UPPER_ALPHA = "upper-alpha";
  public static final String LOWER_ROMAN = "lower-roman";
  public static final String UPPER_ROMAN = "upper-roman";
}

String getListStyleType();
void setListStyleType(String value);
void clearListStyleType();
String getListStyleImage();
void setListStyleImage(String value);
void clearListStyleImage();
String getListStylePosition();
void setListStylePosition(String value);
void clearListStylePosition();
String getMargin();
void setMargin(String value);
void clearMargin();
void setMargin(double value, String unit);
String getMarginBottom();
void setMarginBottom(String value);
void clearMarginBottom();
void setMarginBottom(double value, String unit);
String getMarginLeft();
void setMarginLeft(String value);
void clearMarginLeft();
void setMarginLeft(double value, String unit);
String getMarginRight();
void setMarginRight(String value);
void clearMarginRight();
void setMarginRight(double value, String unit);
String getMarginTop();
void setMarginTop(String value);
void clearMarginTop();
void setMarginTop(double value, String unit);
String getMaxHeight();
void setMaxHeight(String value);
void clearMaxHeight();
String getMaxWidth();
void setMaxWidth(String value);
void clearMaxWidth();
String getMinHeight();
void setMinHeight(String value);
void clearMinHeight();
String getMinWidth();
void setMinWidth(String value);
void clearMinWidth();
double getOpacity();
void setOpacity(double value);
void clearOpacity();
String getOrphans();
void setOrphans(String value);
void clearOrphans();
String getOutline();
void setOutline(String value);
void clearOutline();
String getOutlineColor();
void setOutlineColor(String value);
void clearOutlineColor();
String getOutlineOffset();
void setOutlineOffset(String value);
void clearOutlineOffset();
String getOutlineStyle();
void setOutlineStyle(String value);
void clearOutlineStyle();
String getOutlineWidth();
void setOutlineWidth(String value);
void clearOutlineWidth();

public interface Overflow {
  public static final String VISIBLE = "visible";
  public static final String HIDDEN = "hidden";
  public static final String SCROLL = "scroll";
  public static final String AUTO = "auto";
}

String getOverflow();
void setOverflow(String value);
void clearOverflow();

public interface OverflowX {
  public static final String VISIBLE = "visible";
  public static final String HIDDEN = "hidden";
  public static final String SCROLL = "scroll";
  public static final String AUTO = "auto";
}

String getOverflowX();
void setOverflowX(String value);
void clearOverflowX();

public interface OverflowY {
  public static final String VISIBLE = "visible";
  public static final String HIDDEN = "hidden";
  public static final String SCROLL = "scroll";
  public static final String AUTO = "auto";
}

String getOverflowY();
void setOverflowY(String value);
void clearOverflowY();
String getPadding();
void setPadding(String value);
void clearPadding();
void setPadding(double value, String unit);
String getPaddingBottom();
void setPaddingBottom(String value);
void clearPaddingBottom();
void setPaddingBottom(double value, String unit);
String getPaddingLeft();
void setPaddingLeft(String value);
void clearPaddingLeft();
void setPaddingLeft(double value, String unit);
String getPaddingRight();
void setPaddingRight(String value);
void clearPaddingRight();
void setPaddingRight(double value, String unit);
String getPaddingTop();
void setPaddingTop(String value);
void clearPaddingTop();
void setPaddingTop(double value, String unit);
String getPage();
void setPage(String value);
void clearPage();
String getPageBreakAfter();
void setPageBreakAfter(String value);
void clearPageBreakAfter();
String getPageBreakBefore();
void setPageBreakBefore(String value);
void clearPageBreakBefore();
String getPageBreakInside();
void setPageBreakInside(String value);
void clearPageBreakInside();
String getPointerEvents();
void setPointerEvents(String value);
void clearPointerEvents();

public interface Position {
  public static final String STATIC = "static";
  public static final String RELATIVE = "relative";
  public static final String ABSOLUTE = "absolute";
  public static final String FIXED = "fixed";
}

String getPosition();
void setPosition(String value);
void clearPosition();
String getQuotes();
void setQuotes(String value);
void clearQuotes();
String getResize();
void setResize(String value);
void clearResize();
String getRight();
void setRight(String value);
void clearRight();
void setRight(double value, String unit);
String getSize();
void setSize(String value);
void clearSize();
String getSrc();
void setSrc(String value);
void clearSrc();
String getSpeak();
void setSpeak(String value);
void clearSpeak();
String getTableLayout();
void setTableLayout(String value);
void clearTableLayout();
String getTabSize();
void setTabSize(String value);
void clearTabSize();
String getTextAlign();
void setTextAlign(String value);
void clearTextAlign();

public interface TextDecoration {
  public static final String NONE = "none";
  public static final String UNDERLINE = "underline";
  public static final String OVERLINE = "overline";
  public static final String LINE_THROUGH = "line-through";
}

String getTextDecoration();
void setTextDecoration(String value);
void clearTextDecoration();
String getTextIndent();
void setTextIndent(String value);
void clearTextIndent();
String getTextLineThrough();
void setTextLineThrough(String value);
void clearTextLineThrough();
String getTextLineThroughColor();
void setTextLineThroughColor(String value);
void clearTextLineThroughColor();
String getTextLineThroughMode();
void setTextLineThroughMode(String value);
void clearTextLineThroughMode();
String getTextLineThroughStyle();
void setTextLineThroughStyle(String value);
void clearTextLineThroughStyle();
String getTextLineThroughWidth();
void setTextLineThroughWidth(String value);
void clearTextLineThroughWidth();
String getTextOverflow();
void setTextOverflow(String value);
void clearTextOverflow();
String getTextOverline();
void setTextOverline(String value);
void clearTextOverline();
String getTextOverlineColor();
void setTextOverlineColor(String value);
void clearTextOverlineColor();
String getTextOverlineMode();
void setTextOverlineMode(String value);
void clearTextOverlineMode();
String getTextOverlineStyle();
void setTextOverlineStyle(String value);
void clearTextOverlineStyle();
String getTextOverlineWidth();
void setTextOverlineWidth(String value);
void clearTextOverlineWidth();
String getTextShadow();
void setTextShadow(String value);
void clearTextShadow();
String getTextTransform();
void setTextTransform(String value);
void clearTextTransform();
String getTextUnderline();
void setTextUnderline(String value);
void clearTextUnderline();
String getTextUnderlineColor();
void setTextUnderlineColor(String value);
void clearTextUnderlineColor();
String getTextUnderlineMode();
void setTextUnderlineMode(String value);
void clearTextUnderlineMode();
String getTextUnderlineStyle();
void setTextUnderlineStyle(String value);
void clearTextUnderlineStyle();
String getTextUnderlineWidth();
void setTextUnderlineWidth(String value);
void clearTextUnderlineWidth();
String getTop();
void setTop(String value);
void clearTop();
void setTop(double value, String unit);
String getUnicodeBidi();
void setUnicodeBidi(String value);
void clearUnicodeBidi();
String getUnicodeRange();
void setUnicodeRange(String value);
void clearUnicodeRange();
String getVerticalAlign();
void setVerticalAlign(String value);
void clearVerticalAlign();

public interface Visibility {
  public static final String VISIBLE = "visible";
  public static final String HIDDEN = "hidden";
}

String getVisibility();
void setVisibility(String value);
void clearVisibility();

public interface WhiteSpace {
  public static final String PRE = "pre";
  public static final String NOWRAP = "nowrap";
  public static final String PRE_WRAP = "pre-wrap";
  public static final String PRE_LINE = "pre-line";
}

String getWhiteSpace();
void setWhiteSpace(String value);
void clearWhiteSpace();
String getWidows();
void setWidows(String value);
void clearWidows();
String getWidth();
void setWidth(String value);
void clearWidth();
void setWidth(double value, String unit);
String getWordBreak();
void setWordBreak(String value);
void clearWordBreak();
String getWordSpacing();
void setWordSpacing(String value);
void clearWordSpacing();
String getWordWrap();
void setWordWrap(String value);
void clearWordWrap();
int getZIndex();
void setZIndex(int value);
void clearZIndex();
String getWebkitAnimation();
void setWebkitAnimation(String value);
void clearWebkitAnimation();
String getWebkitAnimationDelay();
void setWebkitAnimationDelay(String value);
void clearWebkitAnimationDelay();
String getWebkitAnimationDirection();
void setWebkitAnimationDirection(String value);
void clearWebkitAnimationDirection();
String getWebkitAnimationDuration();
void setWebkitAnimationDuration(String value);
void clearWebkitAnimationDuration();
String getWebkitAnimationFillMode();
void setWebkitAnimationFillMode(String value);
void clearWebkitAnimationFillMode();
String getWebkitAnimationIterationCount();
void setWebkitAnimationIterationCount(String value);
void clearWebkitAnimationIterationCount();
String getWebkitAnimationName();
void setWebkitAnimationName(String value);
void clearWebkitAnimationName();
String getWebkitAnimationPlayState();
void setWebkitAnimationPlayState(String value);
void clearWebkitAnimationPlayState();
String getWebkitAnimationTimingFunction();
void setWebkitAnimationTimingFunction(String value);
void clearWebkitAnimationTimingFunction();
String getWebkitAppearance();
void setWebkitAppearance(String value);
void clearWebkitAppearance();
String getWebkitAspectRatio();
void setWebkitAspectRatio(String value);
void clearWebkitAspectRatio();
String getWebkitBackfaceVisibility();
void setWebkitBackfaceVisibility(String value);
void clearWebkitBackfaceVisibility();
String getWebkitBackgroundClip();
void setWebkitBackgroundClip(String value);
void clearWebkitBackgroundClip();
String getWebkitBackgroundComposite();
void setWebkitBackgroundComposite(String value);
void clearWebkitBackgroundComposite();
String getWebkitBackgroundOrigin();
void setWebkitBackgroundOrigin(String value);
void clearWebkitBackgroundOrigin();
String getWebkitBackgroundSize();
void setWebkitBackgroundSize(String value);
void clearWebkitBackgroundSize();
String getWebkitBorderAfter();
void setWebkitBorderAfter(String value);
void clearWebkitBorderAfter();
String getWebkitBorderAfterColor();
void setWebkitBorderAfterColor(String value);
void clearWebkitBorderAfterColor();
String getWebkitBorderAfterStyle();
void setWebkitBorderAfterStyle(String value);
void clearWebkitBorderAfterStyle();
String getWebkitBorderAfterWidth();
void setWebkitBorderAfterWidth(String value);
void clearWebkitBorderAfterWidth();
String getWebkitBorderBefore();
void setWebkitBorderBefore(String value);
void clearWebkitBorderBefore();
String getWebkitBorderBeforeColor();
void setWebkitBorderBeforeColor(String value);
void clearWebkitBorderBeforeColor();
String getWebkitBorderBeforeStyle();
void setWebkitBorderBeforeStyle(String value);
void clearWebkitBorderBeforeStyle();
String getWebkitBorderBeforeWidth();
void setWebkitBorderBeforeWidth(String value);
void clearWebkitBorderBeforeWidth();
String getWebkitBorderEnd();
void setWebkitBorderEnd(String value);
void clearWebkitBorderEnd();
String getWebkitBorderEndColor();
void setWebkitBorderEndColor(String value);
void clearWebkitBorderEndColor();
String getWebkitBorderEndStyle();
void setWebkitBorderEndStyle(String value);
void clearWebkitBorderEndStyle();
String getWebkitBorderEndWidth();
void setWebkitBorderEndWidth(String value);
void clearWebkitBorderEndWidth();
String getWebkitBorderFit();
void setWebkitBorderFit(String value);
void clearWebkitBorderFit();
String getWebkitBorderHorizontalSpacing();
void setWebkitBorderHorizontalSpacing(String value);
void clearWebkitBorderHorizontalSpacing();
String getWebkitBorderImage();
void setWebkitBorderImage(String value);
void clearWebkitBorderImage();
String getWebkitBorderRadius();
void setWebkitBorderRadius(String value);
void clearWebkitBorderRadius();
String getWebkitBorderStart();
void setWebkitBorderStart(String value);
void clearWebkitBorderStart();
String getWebkitBorderStartColor();
void setWebkitBorderStartColor(String value);
void clearWebkitBorderStartColor();
String getWebkitBorderStartStyle();
void setWebkitBorderStartStyle(String value);
void clearWebkitBorderStartStyle();
String getWebkitBorderStartWidth();
void setWebkitBorderStartWidth(String value);
void clearWebkitBorderStartWidth();
String getWebkitBorderVerticalSpacing();
void setWebkitBorderVerticalSpacing(String value);
void clearWebkitBorderVerticalSpacing();
String getWebkitBoxAlign();
void setWebkitBoxAlign(String value);
void clearWebkitBoxAlign();
String getWebkitBoxDirection();
void setWebkitBoxDirection(String value);
void clearWebkitBoxDirection();
String getWebkitBoxFlex();
void setWebkitBoxFlex(String value);
void clearWebkitBoxFlex();
String getWebkitBoxFlexGroup();
void setWebkitBoxFlexGroup(String value);
void clearWebkitBoxFlexGroup();
String getWebkitBoxLines();
void setWebkitBoxLines(String value);
void clearWebkitBoxLines();
String getWebkitBoxOrdinalGroup();
void setWebkitBoxOrdinalGroup(String value);
void clearWebkitBoxOrdinalGroup();
String getWebkitBoxOrient();
void setWebkitBoxOrient(String value);
void clearWebkitBoxOrient();
String getWebkitBoxPack();
void setWebkitBoxPack(String value);
void clearWebkitBoxPack();
String getWebkitBoxReflect();
void setWebkitBoxReflect(String value);
void clearWebkitBoxReflect();
String getWebkitBoxShadow();
void setWebkitBoxShadow(String value);
void clearWebkitBoxShadow();
String getWebkitColorCorrection();
void setWebkitColorCorrection(String value);
void clearWebkitColorCorrection();
String getWebkitColumnAxis();
void setWebkitColumnAxis(String value);
void clearWebkitColumnAxis();
String getWebkitColumnBreakAfter();
void setWebkitColumnBreakAfter(String value);
void clearWebkitColumnBreakAfter();
String getWebkitColumnBreakBefore();
void setWebkitColumnBreakBefore(String value);
void clearWebkitColumnBreakBefore();
String getWebkitColumnBreakInside();
void setWebkitColumnBreakInside(String value);
void clearWebkitColumnBreakInside();
String getWebkitColumnCount();
void setWebkitColumnCount(String value);
void clearWebkitColumnCount();
String getWebkitColumnGap();
void setWebkitColumnGap(String value);
void clearWebkitColumnGap();
String getWebkitColumnRule();
void setWebkitColumnRule(String value);
void clearWebkitColumnRule();
String getWebkitColumnRuleColor();
void setWebkitColumnRuleColor(String value);
void clearWebkitColumnRuleColor();
String getWebkitColumnRuleStyle();
void setWebkitColumnRuleStyle(String value);
void clearWebkitColumnRuleStyle();
String getWebkitColumnRuleWidth();
void setWebkitColumnRuleWidth(String value);
void clearWebkitColumnRuleWidth();
String getWebkitColumnSpan();
void setWebkitColumnSpan(String value);
void clearWebkitColumnSpan();
String getWebkitColumnWidth();
void setWebkitColumnWidth(String value);
void clearWebkitColumnWidth();
String getWebkitColumns();
void setWebkitColumns(String value);
void clearWebkitColumns();
String getWebkitFilter();
void setWebkitFilter(String value);
void clearWebkitFilter();
String getWebkitFlex();
void setWebkitFlex(String value);
void clearWebkitFlex();
String getWebkitFlexAlign();
void setWebkitFlexAlign(String value);
void clearWebkitFlexAlign();
String getWebkitFlexDirection();
void setWebkitFlexDirection(String value);
void clearWebkitFlexDirection();
String getWebkitFlexFlow();
void setWebkitFlexFlow(String value);
void clearWebkitFlexFlow();
String getWebkitFlexItemAlign();
void setWebkitFlexItemAlign(String value);
void clearWebkitFlexItemAlign();
String getWebkitFlexLinePack();
void setWebkitFlexLinePack(String value);
void clearWebkitFlexLinePack();
String getWebkitFlexOrder();
void setWebkitFlexOrder(String value);
void clearWebkitFlexOrder();
String getWebkitFlexPack();
void setWebkitFlexPack(String value);
void clearWebkitFlexPack();
String getWebkitFlexWrap();
void setWebkitFlexWrap(String value);
void clearWebkitFlexWrap();
String getWebkitFontSizeDelta();
void setWebkitFontSizeDelta(String value);
void clearWebkitFontSizeDelta();
String getWebkitGridColumns();
void setWebkitGridColumns(String value);
void clearWebkitGridColumns();
String getWebkitGridRows();
void setWebkitGridRows(String value);
void clearWebkitGridRows();
String getWebkitGridColumn();
void setWebkitGridColumn(String value);
void clearWebkitGridColumn();
String getWebkitGridRow();
void setWebkitGridRow(String value);
void clearWebkitGridRow();
String getWebkitHighlight();
void setWebkitHighlight(String value);
void clearWebkitHighlight();
String getWebkitHyphenateCharacter();
void setWebkitHyphenateCharacter(String value);
void clearWebkitHyphenateCharacter();
String getWebkitHyphenateLimitAfter();
void setWebkitHyphenateLimitAfter(String value);
void clearWebkitHyphenateLimitAfter();
String getWebkitHyphenateLimitBefore();
void setWebkitHyphenateLimitBefore(String value);
void clearWebkitHyphenateLimitBefore();
String getWebkitHyphenateLimitLines();
void setWebkitHyphenateLimitLines(String value);
void clearWebkitHyphenateLimitLines();
String getWebkitHyphens();
void setWebkitHyphens(String value);
void clearWebkitHyphens();
String getWebkitLineBoxContain();
void setWebkitLineBoxContain(String value);
void clearWebkitLineBoxContain();
String getWebkitLineAlign();
void setWebkitLineAlign(String value);
void clearWebkitLineAlign();
String getWebkitLineBreak();
void setWebkitLineBreak(String value);
void clearWebkitLineBreak();
String getWebkitLineClamp();
void setWebkitLineClamp(String value);
void clearWebkitLineClamp();
String getWebkitLineGrid();
void setWebkitLineGrid(String value);
void clearWebkitLineGrid();
String getWebkitLineSnap();
void setWebkitLineSnap(String value);
void clearWebkitLineSnap();
String getWebkitLogicalWidth();
void setWebkitLogicalWidth(String value);
void clearWebkitLogicalWidth();
String getWebkitLogicalHeight();
void setWebkitLogicalHeight(String value);
void clearWebkitLogicalHeight();
String getWebkitMarginAfterCollapse();
void setWebkitMarginAfterCollapse(String value);
void clearWebkitMarginAfterCollapse();
String getWebkitMarginBeforeCollapse();
void setWebkitMarginBeforeCollapse(String value);
void clearWebkitMarginBeforeCollapse();
String getWebkitMarginBottomCollapse();
void setWebkitMarginBottomCollapse(String value);
void clearWebkitMarginBottomCollapse();
String getWebkitMarginTopCollapse();
void setWebkitMarginTopCollapse(String value);
void clearWebkitMarginTopCollapse();
String getWebkitMarginCollapse();
void setWebkitMarginCollapse(String value);
void clearWebkitMarginCollapse();
String getWebkitMarginAfter();
void setWebkitMarginAfter(String value);
void clearWebkitMarginAfter();
String getWebkitMarginBefore();
void setWebkitMarginBefore(String value);
void clearWebkitMarginBefore();
String getWebkitMarginEnd();
void setWebkitMarginEnd(String value);
void clearWebkitMarginEnd();
String getWebkitMarginStart();
void setWebkitMarginStart(String value);
void clearWebkitMarginStart();
String getWebkitMarquee();
void setWebkitMarquee(String value);
void clearWebkitMarquee();
String getWebkitMarqueeDirection();
void setWebkitMarqueeDirection(String value);
void clearWebkitMarqueeDirection();
String getWebkitMarqueeIncrement();
void setWebkitMarqueeIncrement(String value);
void clearWebkitMarqueeIncrement();
String getWebkitMarqueeRepetition();
void setWebkitMarqueeRepetition(String value);
void clearWebkitMarqueeRepetition();
String getWebkitMarqueeSpeed();
void setWebkitMarqueeSpeed(String value);
void clearWebkitMarqueeSpeed();
String getWebkitMarqueeStyle();
void setWebkitMarqueeStyle(String value);
void clearWebkitMarqueeStyle();
String getWebkitMask();
void setWebkitMask(String value);
void clearWebkitMask();
String getWebkitMaskAttachment();
void setWebkitMaskAttachment(String value);
void clearWebkitMaskAttachment();
String getWebkitMaskBoxImage();
void setWebkitMaskBoxImage(String value);
void clearWebkitMaskBoxImage();
String getWebkitMaskBoxImageOutset();
void setWebkitMaskBoxImageOutset(String value);
void clearWebkitMaskBoxImageOutset();
String getWebkitMaskBoxImageRepeat();
void setWebkitMaskBoxImageRepeat(String value);
void clearWebkitMaskBoxImageRepeat();
String getWebkitMaskBoxImageSlice();
void setWebkitMaskBoxImageSlice(String value);
void clearWebkitMaskBoxImageSlice();
String getWebkitMaskBoxImageSource();
void setWebkitMaskBoxImageSource(String value);
void clearWebkitMaskBoxImageSource();
String getWebkitMaskBoxImageWidth();
void setWebkitMaskBoxImageWidth(String value);
void clearWebkitMaskBoxImageWidth();
String getWebkitMaskClip();
void setWebkitMaskClip(String value);
void clearWebkitMaskClip();
String getWebkitMaskComposite();
void setWebkitMaskComposite(String value);
void clearWebkitMaskComposite();
String getWebkitMaskImage();
void setWebkitMaskImage(String value);
void clearWebkitMaskImage();
String getWebkitMaskOrigin();
void setWebkitMaskOrigin(String value);
void clearWebkitMaskOrigin();
String getWebkitMaskPosition();
void setWebkitMaskPosition(String value);
void clearWebkitMaskPosition();
String getWebkitMaskPositionX();
void setWebkitMaskPositionX(String value);
void clearWebkitMaskPositionX();
String getWebkitMaskPositionY();
void setWebkitMaskPositionY(String value);
void clearWebkitMaskPositionY();
String getWebkitMaskRepeat();
void setWebkitMaskRepeat(String value);
void clearWebkitMaskRepeat();
String getWebkitMaskRepeatX();
void setWebkitMaskRepeatX(String value);
void clearWebkitMaskRepeatX();
String getWebkitMaskRepeatY();
void setWebkitMaskRepeatY(String value);
void clearWebkitMaskRepeatY();
String getWebkitMaskSize();
void setWebkitMaskSize(String value);
void clearWebkitMaskSize();
String getWebkitMatchNearestMailBlockquoteColor();
void setWebkitMatchNearestMailBlockquoteColor(String value);
void clearWebkitMatchNearestMailBlockquoteColor();
String getWebkitMaxLogicalWidth();
void setWebkitMaxLogicalWidth(String value);
void clearWebkitMaxLogicalWidth();
String getWebkitMaxLogicalHeight();
void setWebkitMaxLogicalHeight(String value);
void clearWebkitMaxLogicalHeight();
String getWebkitMinLogicalWidth();
void setWebkitMinLogicalWidth(String value);
void clearWebkitMinLogicalWidth();
String getWebkitMinLogicalHeight();
void setWebkitMinLogicalHeight(String value);
void clearWebkitMinLogicalHeight();
String getWebkitNbspMode();
void setWebkitNbspMode(String value);
void clearWebkitNbspMode();
String getWebkitPaddingAfter();
void setWebkitPaddingAfter(String value);
void clearWebkitPaddingAfter();
String getWebkitPaddingBefore();
void setWebkitPaddingBefore(String value);
void clearWebkitPaddingBefore();
String getWebkitPaddingEnd();
void setWebkitPaddingEnd(String value);
void clearWebkitPaddingEnd();
String getWebkitPaddingStart();
void setWebkitPaddingStart(String value);
void clearWebkitPaddingStart();
String getWebkitPerspective();
void setWebkitPerspective(String value);
void clearWebkitPerspective();
String getWebkitPerspectiveOrigin();
void setWebkitPerspectiveOrigin(String value);
void clearWebkitPerspectiveOrigin();
String getWebkitPerspectiveOriginX();
void setWebkitPerspectiveOriginX(String value);
void clearWebkitPerspectiveOriginX();
String getWebkitPerspectiveOriginY();
void setWebkitPerspectiveOriginY(String value);
void clearWebkitPerspectiveOriginY();
String getWebkitPrintColorAdjust();
void setWebkitPrintColorAdjust(String value);
void clearWebkitPrintColorAdjust();
String getWebkitRtlOrdering();
void setWebkitRtlOrdering(String value);
void clearWebkitRtlOrdering();
String getWebkitTextCombine();
void setWebkitTextCombine(String value);
void clearWebkitTextCombine();
String getWebkitTextDecorationsInEffect();
void setWebkitTextDecorationsInEffect(String value);
void clearWebkitTextDecorationsInEffect();
String getWebkitTextEmphasis();
void setWebkitTextEmphasis(String value);
void clearWebkitTextEmphasis();
String getWebkitTextEmphasisColor();
void setWebkitTextEmphasisColor(String value);
void clearWebkitTextEmphasisColor();
String getWebkitTextEmphasisPosition();
void setWebkitTextEmphasisPosition(String value);
void clearWebkitTextEmphasisPosition();
String getWebkitTextEmphasisStyle();
void setWebkitTextEmphasisStyle(String value);
void clearWebkitTextEmphasisStyle();
String getWebkitTextFillColor();
void setWebkitTextFillColor(String value);
void clearWebkitTextFillColor();
String getWebkitTextSecurity();
void setWebkitTextSecurity(String value);
void clearWebkitTextSecurity();
String getWebkitTextStroke();
void setWebkitTextStroke(String value);
void clearWebkitTextStroke();
String getWebkitTextStrokeColor();
void setWebkitTextStrokeColor(String value);
void clearWebkitTextStrokeColor();
String getWebkitTextStrokeWidth();
void setWebkitTextStrokeWidth(String value);
void clearWebkitTextStrokeWidth();
String getWebkitTransform();
void setWebkitTransform(String value);
void clearWebkitTransform();
String getWebkitTransformOrigin();
void setWebkitTransformOrigin(String value);
void clearWebkitTransformOrigin();
String getWebkitTransformOriginX();
void setWebkitTransformOriginX(String value);
void clearWebkitTransformOriginX();
String getWebkitTransformOriginY();
void setWebkitTransformOriginY(String value);
void clearWebkitTransformOriginY();
String getWebkitTransformOriginZ();
void setWebkitTransformOriginZ(String value);
void clearWebkitTransformOriginZ();
String getWebkitTransformStyle();
void setWebkitTransformStyle(String value);
void clearWebkitTransformStyle();
String getWebkitTransition();
void setWebkitTransition(String value);
void clearWebkitTransition();
String getWebkitTransitionDelay();
void setWebkitTransitionDelay(String value);
void clearWebkitTransitionDelay();
String getWebkitTransitionDuration();
void setWebkitTransitionDuration(String value);
void clearWebkitTransitionDuration();
String getWebkitTransitionProperty();
void setWebkitTransitionProperty(String value);
void clearWebkitTransitionProperty();
String getWebkitTransitionTimingFunction();
void setWebkitTransitionTimingFunction(String value);
void clearWebkitTransitionTimingFunction();
String getWebkitUserDrag();
void setWebkitUserDrag(String value);
void clearWebkitUserDrag();
String getWebkitUserModify();
void setWebkitUserModify(String value);
void clearWebkitUserModify();
String getWebkitUserSelect();
void setWebkitUserSelect(String value);
void clearWebkitUserSelect();
String getWebkitFlowInto();
void setWebkitFlowInto(String value);
void clearWebkitFlowInto();
String getWebkitFlowFrom();
void setWebkitFlowFrom(String value);
void clearWebkitFlowFrom();
String getWebkitRegionOverflow();
void setWebkitRegionOverflow(String value);
void clearWebkitRegionOverflow();
String getWebkitShapeInside();
void setWebkitShapeInside(String value);
void clearWebkitShapeInside();
String getWebkitShapeOutside();
void setWebkitShapeOutside(String value);
void clearWebkitShapeOutside();
String getWebkitWrapMargin();
void setWebkitWrapMargin(String value);
void clearWebkitWrapMargin();
String getWebkitWrapPadding();
void setWebkitWrapPadding(String value);
void clearWebkitWrapPadding();
String getWebkitRegionBreakAfter();
void setWebkitRegionBreakAfter(String value);
void clearWebkitRegionBreakAfter();
String getWebkitRegionBreakBefore();
void setWebkitRegionBreakBefore(String value);
void clearWebkitRegionBreakBefore();
String getWebkitRegionBreakInside();
void setWebkitRegionBreakInside(String value);
void clearWebkitRegionBreakInside();
String getWebkitWrapFlow();
void setWebkitWrapFlow(String value);
void clearWebkitWrapFlow();
String getWebkitWrapThrough();
void setWebkitWrapThrough(String value);
void clearWebkitWrapThrough();
String getWebkitWrap();
void setWebkitWrap(String value);
void clearWebkitWrap();
String getWebkitTapHighlightColor();
void setWebkitTapHighlightColor(String value);
void clearWebkitTapHighlightColor();
String getWebkitDashboardRegion();
void setWebkitDashboardRegion(String value);
void clearWebkitDashboardRegion();
String getWebkitOverflowScrolling();
void setWebkitOverflowScrolling(String value);
void clearWebkitOverflowScrolling();
}