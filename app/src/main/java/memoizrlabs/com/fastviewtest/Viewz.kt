package memoizrlabs.com.fastviewtest

import android.appwidget.AppWidgetHostView
import android.view.View
import android.view.ViewManager
import android.webkit.WebView
import org.jetbrains.anko.*

inline fun ViewManager.imageButton(vararg styles: android.widget.ImageButton.() -> Unit, init: android.widget.ImageButton.() -> Unit): android.widget.ImageButton {
    return imageButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.gestureOverlayView(vararg styles: android.gesture.GestureOverlayView.() -> Unit, init: android.gesture.GestureOverlayView.() -> Unit): android.gesture.GestureOverlayView {
    return gestureOverlayView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.extractEditText(vararg styles: android.inputmethodservice.ExtractEditText.() -> Unit, init: android.inputmethodservice.ExtractEditText.() -> Unit): android.inputmethodservice.ExtractEditText {
    return extractEditText(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.gLSurfaceView(vararg styles: android.opengl.GLSurfaceView.() -> Unit, init: android.opengl.GLSurfaceView.() -> Unit): android.opengl.GLSurfaceView {
    return gLSurfaceView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.surfaceView(vararg styles: android.view.SurfaceView.() -> Unit, init: android.view.SurfaceView.() -> Unit): android.view.SurfaceView {
    return surfaceView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.textureView(vararg styles: android.view.TextureView.() -> Unit, init: android.view.TextureView.() -> Unit): android.view.TextureView {
    return textureView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.view(vararg styles: android.view.View.() -> Unit, init: android.view.View.() -> Unit): android.view.View {
    return view(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.viewStub(vararg styles: android.view.ViewStub.() -> Unit, init: android.view.ViewStub.() -> Unit): android.view.ViewStub {
    return viewStub(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.adapterViewFlipper(vararg styles: android.widget.AdapterViewFlipper.() -> Unit, init: android.widget.AdapterViewFlipper.() -> Unit): android.widget.AdapterViewFlipper {
    return adapterViewFlipper(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.analogClock(vararg styles: android.widget.AnalogClock.() -> Unit, init: android.widget.AnalogClock.() -> Unit): android.widget.AnalogClock {
    return analogClock(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.autoCompleteTextView(vararg styles: android.widget.AutoCompleteTextView.() -> Unit, init: android.widget.AutoCompleteTextView.() -> Unit): android.widget.AutoCompleteTextView {
    return autoCompleteTextView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.button(vararg styles: android.widget.Button.() -> Unit, init: android.widget.Button.() -> Unit): android.widget.Button {
    return button(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.calendarView(vararg styles: android.widget.CalendarView.() -> Unit, init: android.widget.CalendarView.() -> Unit): android.widget.CalendarView {
    return calendarView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.checkBox(vararg styles: android.widget.CheckBox.() -> Unit, init: android.widget.CheckBox.() -> Unit): android.widget.CheckBox {
    return checkBox(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.checkedTextView(vararg styles: android.widget.CheckedTextView.() -> Unit, init: android.widget.CheckedTextView.() -> Unit): android.widget.CheckedTextView {
    return checkedTextView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.chronometer(vararg styles: android.widget.Chronometer.() -> Unit, init: android.widget.Chronometer.() -> Unit): android.widget.Chronometer {
    return chronometer(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.datePicker(vararg styles: android.widget.DatePicker.() -> Unit, init: android.widget.DatePicker.() -> Unit): android.widget.DatePicker {
    return datePicker(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.dialerFilter(vararg styles: android.widget.DialerFilter.() -> Unit, init: android.widget.DialerFilter.() -> Unit): android.widget.DialerFilter {
    return dialerFilter(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.editText(vararg styles: android.widget.EditText.() -> Unit, init: android.widget.EditText.() -> Unit): android.widget.EditText {
    return editText(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.expandableListView(vararg styles: android.widget.ExpandableListView.() -> Unit, init: android.widget.ExpandableListView.() -> Unit): android.widget.ExpandableListView {
    return expandableListView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.imageView(vararg styles: android.widget.ImageView.() -> Unit, init: android.widget.ImageView.() -> Unit): android.widget.ImageView {
    return imageView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.listView(vararg styles: android.widget.ListView.() -> Unit, init: android.widget.ListView.() -> Unit): android.widget.ListView {
    return listView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.multiAutoCompleteTextView(vararg styles: android.widget.MultiAutoCompleteTextView.() -> Unit, init: android.widget.MultiAutoCompleteTextView.() -> Unit): android.widget.MultiAutoCompleteTextView {
    return multiAutoCompleteTextView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.numberPicker(vararg styles: android.widget.NumberPicker.() -> Unit, init: android.widget.NumberPicker.() -> Unit): android.widget.NumberPicker {
    return numberPicker(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.progressBar(vararg styles: android.widget.ProgressBar.() -> Unit, init: android.widget.ProgressBar.() -> Unit): android.widget.ProgressBar {
    return progressBar(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.quickContactBadge(vararg styles: android.widget.QuickContactBadge.() -> Unit, init: android.widget.QuickContactBadge.() -> Unit): android.widget.QuickContactBadge {
    return quickContactBadge(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.radioButton(vararg styles: android.widget.RadioButton.() -> Unit, init: android.widget.RadioButton.() -> Unit): android.widget.RadioButton {
    return radioButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.ratingBar(vararg styles: android.widget.RatingBar.() -> Unit, init: android.widget.RatingBar.() -> Unit): android.widget.RatingBar {
    return ratingBar(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.searchView(vararg styles: android.widget.SearchView.() -> Unit, init: android.widget.SearchView.() -> Unit): android.widget.SearchView {
    return searchView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.seekBar(vararg styles: android.widget.SeekBar.() -> Unit, init: android.widget.SeekBar.() -> Unit): android.widget.SeekBar {
    return seekBar(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.slidingDrawer(vararg styles: android.widget.SlidingDrawer.() -> Unit, init: android.widget.SlidingDrawer.() -> Unit): android.widget.SlidingDrawer {
    return slidingDrawer(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.space(vararg styles: android.widget.Space.() -> Unit, init: android.widget.Space.() -> Unit): android.widget.Space {
    return space(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.spinner(vararg styles: android.widget.Spinner.() -> Unit, init: android.widget.Spinner.() -> Unit): android.widget.Spinner {
    return spinner(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.stackView(vararg styles: android.widget.StackView.() -> Unit, init: android.widget.StackView.() -> Unit): android.widget.StackView {
    return stackView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.switch(vararg styles: android.widget.Switch.() -> Unit, init: android.widget.Switch.() -> Unit): android.widget.Switch {
    return switch(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.tabHost(vararg styles: android.widget.TabHost.() -> Unit, init: android.widget.TabHost.() -> Unit): android.widget.TabHost {
    return tabHost(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.tabWidget(vararg styles: android.widget.TabWidget.() -> Unit, init: android.widget.TabWidget.() -> Unit): android.widget.TabWidget {
    return tabWidget(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.textView(vararg styles: android.widget.TextView.() -> Unit, init: android.widget.TextView.() -> Unit): android.widget.TextView {
    return textView(init).apply { styles.forEach { this.it() }; id = View.generateViewId() }
}

inline fun ViewManager.timePicker(vararg styles: android.widget.TimePicker.() -> Unit, init: android.widget.TimePicker.() -> Unit): android.widget.TimePicker {
    return timePicker(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.toggleButton(vararg styles: android.widget.ToggleButton.() -> Unit, init: android.widget.ToggleButton.() -> Unit): android.widget.ToggleButton {
    return toggleButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.twoLineListItem(vararg styles: android.widget.TwoLineListItem.() -> Unit, init: android.widget.TwoLineListItem.() -> Unit): android.widget.TwoLineListItem {
    return twoLineListItem(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.videoView(vararg styles: android.widget.VideoView.() -> Unit, init: android.widget.VideoView.() -> Unit): android.widget.VideoView {
    return videoView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.viewFlipper(vararg styles: android.widget.ViewFlipper.() -> Unit, init: android.widget.ViewFlipper.() -> Unit): android.widget.ViewFlipper {
    return viewFlipper(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.zoomButton(vararg styles: android.widget.ZoomButton.() -> Unit, init: android.widget.ZoomButton.() -> Unit): android.widget.ZoomButton {
    return zoomButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.zoomControls(vararg styles: android.widget.ZoomControls.() -> Unit, init: android.widget.ZoomControls.() -> Unit): android.widget.ZoomControls {
    return zoomControls(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.appWidgetHostView(vararg styles: AppWidgetHostView.() -> Unit, init: _AppWidgetHostView.() -> Unit): android.appwidget.AppWidgetHostView {
    return appWidgetHostView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.absoluteLayout(vararg styles: android.widget.AbsoluteLayout.() -> Unit, init: _AbsoluteLayout.() -> Unit): android.widget.AbsoluteLayout {
    return absoluteLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.webView(vararg styles: WebView.() -> Unit, init: _WebView.() -> Unit): android.webkit.WebView {
    return webView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.frameLayout(vararg styles: android.widget.FrameLayout.() -> Unit, init: _FrameLayout.() -> Unit): android.widget.FrameLayout {
    return frameLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.gallery(vararg styles: android.widget.Gallery.() -> Unit, init: _Gallery.() -> Unit): android.widget.Gallery {
    return gallery(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.gridLayout(vararg styles: android.widget.GridLayout.() -> Unit, init: _GridLayout.() -> Unit): android.widget.GridLayout {
    return gridLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.gridView(vararg styles: android.widget.GridView.() -> Unit, init: _GridView.() -> Unit): android.widget.GridView {
    return gridView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.horizontalScrollView(vararg styles: android.widget.HorizontalScrollView.() -> Unit, init: _HorizontalScrollView.() -> Unit): android.widget.HorizontalScrollView {
    return horizontalScrollView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.imageSwitcher(vararg styles: android.widget.ImageSwitcher.() -> Unit, init: _ImageSwitcher.() -> Unit): android.widget.ImageSwitcher {
    return imageSwitcher(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.linearLayout(vararg styles: android.widget.LinearLayout.() -> Unit, init: _LinearLayout.() -> Unit): android.widget.LinearLayout {
    return linearLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.radioGroup(vararg styles: android.widget.RadioGroup.() -> Unit, init: _RadioGroup.() -> Unit): android.widget.RadioGroup {
    return radioGroup(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.relativeLayout(vararg styles: android.widget.RelativeLayout.() -> Unit, init: _RelativeLayout.() -> Unit): android.widget.RelativeLayout {
    return relativeLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.tableLayout(vararg styles: android.widget.TableLayout.() -> Unit, init: _TableLayout.() -> Unit): android.widget.TableLayout {
    return tableLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.tableRow(vararg styles: android.widget.TableRow.() -> Unit, init: _TableRow.() -> Unit): android.widget.TableRow {
    return tableRow(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.textSwitcher(vararg styles: android.widget.TextSwitcher.() -> Unit, init: _TextSwitcher.() -> Unit): android.widget.TextSwitcher {
    return textSwitcher(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.viewAnimator(vararg styles: android.widget.ViewAnimator.() -> Unit, init: _ViewAnimator.() -> Unit): android.widget.ViewAnimator {
    return viewAnimator(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}

inline fun ViewManager.viewSwitcher(vararg styles: android.widget.ViewSwitcher.() -> Unit, init: _ViewSwitcher.() -> Unit): android.widget.ViewSwitcher {
    return viewSwitcher(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
}
