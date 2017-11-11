/*
 * Copyright 2007 Google Inc.
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
package org.gwtproject.user.window.client;

/**
 * Implement this interface to receive resize events from the browser window.
 * 
 * @see org.gwtproject.user.window.client.Window#addWindowResizeListener(WindowResizeListener)
 * @deprecated use {@link com.google.gwt.event.logical.shared.ResizeHandler}
 *             instead
 */
@Deprecated
public interface WindowResizeListener extends java.util.EventListener {

  /**
   * Called when the browser window is resized.
   * 
   * @param width the width of the window's client area.
   * @param height the height of the window's client area.
   */
  @Deprecated
  void onWindowResized(int width, int height);
}
