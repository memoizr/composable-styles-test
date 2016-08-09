package memoizrlabs.com.composable_styles.utils

//inline fun ViewManager.imageButton(vararg styles: ImageButton.() -> Unit, init: ImageButton.() -> Unit): ImageButton {
//    return imageButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.gestureOverlayView(vararg styles: GestureOverlayView.() -> Unit, init: GestureOverlayView.() -> Unit): GestureOverlayView {
//    return gestureOverlayView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.extractEditText(vararg styles: ExtractEditText.() -> Unit, init: ExtractEditText.() -> Unit): ExtractEditText {
//    return extractEditText(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.gLSurfaceView(vararg styles: GLSurfaceView.() -> Unit, init: GLSurfaceView.() -> Unit): GLSurfaceView {
//    return gLSurfaceView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.surfaceView(vararg styles: SurfaceView.() -> Unit, init: SurfaceView.() -> Unit): SurfaceView {
//    return surfaceView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.textureView(vararg styles: TextureView.() -> Unit, init: TextureView.() -> Unit): TextureView {
//    return textureView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.view(vararg styles: View.() -> Unit, init: View.() -> Unit): View {
//    return view(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.viewStub(vararg styles: ViewStub.() -> Unit, init: ViewStub.() -> Unit): ViewStub {
//    return viewStub(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.adapterViewFlipper(vararg styles: AdapterViewFlipper.() -> Unit, init: AdapterViewFlipper.() -> Unit): AdapterViewFlipper {
//    return adapterViewFlipper(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.analogClock(vararg styles: AnalogClock.() -> Unit, init: AnalogClock.() -> Unit): AnalogClock {
//    return analogClock(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.autoCompleteTextView(vararg styles: AutoCompleteTextView.() -> Unit, init: AutoCompleteTextView.() -> Unit): AutoCompleteTextView {
//    return autoCompleteTextView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.button(vararg styles: Button.() -> Unit, init: Button.() -> Unit): Button {
//    return button(init).apply { style?.invoke(this) ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.calendarView(vararg styles: CalendarView.() -> Unit, init: CalendarView.() -> Unit): CalendarView {
//    return calendarView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.checkBox(vararg styles: CheckBox.() -> Unit, init: CheckBox.() -> Unit): CheckBox {
//    return checkBox(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.checkedTextView(vararg styles: CheckedTextView.() -> Unit, init: CheckedTextView.() -> Unit): CheckedTextView {
//    return checkedTextView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.chronometer(vararg styles: Chronometer.() -> Unit, init: Chronometer.() -> Unit): Chronometer {
//    return chronometer(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.datePicker(vararg styles: DatePicker.() -> Unit, init: DatePicker.() -> Unit): DatePicker {
//    return datePicker(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.dialerFilter(vararg styles: DialerFilter.() -> Unit, init: DialerFilter.() -> Unit): DialerFilter {
//    return dialerFilter(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.editText(vararg styles: EditText.() -> Unit, init: EditText.() -> Unit): EditText {
//    return editText(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.expandableListView(vararg styles: ExpandableListView.() -> Unit, init: ExpandableListView.() -> Unit): ExpandableListView {
//    return expandableListView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.imageView(vararg styles: ImageView.() -> Unit, init: ImageView.() -> Unit): ImageView {
//    return imageView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.listView(vararg styles: ListView.() -> Unit, init: ListView.() -> Unit): ListView {
//    return listView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.multiAutoCompleteTextView(vararg styles: MultiAutoCompleteTextView.() -> Unit, init: MultiAutoCompleteTextView.() -> Unit): MultiAutoCompleteTextView {
//    return multiAutoCompleteTextView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.numberPicker(vararg styles: NumberPicker.() -> Unit, init: NumberPicker.() -> Unit): NumberPicker {
//    return numberPicker(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.progressBar(vararg styles: ProgressBar.() -> Unit, init: ProgressBar.() -> Unit): ProgressBar {
//    return progressBar(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.quickContactBadge(vararg styles: QuickContactBadge.() -> Unit, init: QuickContactBadge.() -> Unit): QuickContactBadge {
//    return quickContactBadge(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.radioButton(vararg styles: RadioButton.() -> Unit, init: RadioButton.() -> Unit): RadioButton {
//    return radioButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.ratingBar(vararg styles: RatingBar.() -> Unit, init: RatingBar.() -> Unit): RatingBar {
//    return ratingBar(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.searchView(vararg styles: SearchView.() -> Unit, init: SearchView.() -> Unit): SearchView {
//    return searchView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.seekBar(vararg styles: SeekBar.() -> Unit, init: SeekBar.() -> Unit): SeekBar {
//    return seekBar(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.slidingDrawer(vararg styles: SlidingDrawer.() -> Unit, init: SlidingDrawer.() -> Unit): SlidingDrawer {
//    return slidingDrawer(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.space(vararg styles: Space.() -> Unit, init: Space.() -> Unit): Space {
//    return space(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.spinner(vararg styles: Spinner.() -> Unit, init: Spinner.() -> Unit): Spinner {
//    return spinner(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.stackView(vararg styles: StackView.() -> Unit, init: StackView.() -> Unit): StackView {
//    return stackView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.switch(vararg styles: Switch.() -> Unit, init: Switch.() -> Unit): Switch {
//    return switch(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.tabHost(vararg styles: TabHost.() -> Unit, init: TabHost.() -> Unit): TabHost {
//    return tabHost(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.tabWidget(vararg styles: TabWidget.() -> Unit, init: TabWidget.() -> Unit): TabWidget {
//    return tabWidget(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.textView(vararg styles: TextView.() -> Unit, init: TextView.() -> Unit): TextView {
//    return textView(init).apply { styles.forEach { this.it() }; id = View.generateViewId() }
//}
//
//inline fun ViewManager.timePicker(vararg styles: TimePicker.() -> Unit, init: TimePicker.() -> Unit): TimePicker {
//    return timePicker(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.toggleButton(vararg styles: ToggleButton.() -> Unit, init: ToggleButton.() -> Unit): ToggleButton {
//    return toggleButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.twoLineListItem(vararg styles: TwoLineListItem.() -> Unit, init: TwoLineListItem.() -> Unit): TwoLineListItem {
//    return twoLineListItem(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.videoView(vararg styles: VideoView.() -> Unit, init: VideoView.() -> Unit): VideoView {
//    return videoView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.viewFlipper(vararg styles: ViewFlipper.() -> Unit, init: ViewFlipper.() -> Unit): ViewFlipper {
//    return viewFlipper(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.zoomButton(vararg styles: ZoomButton.() -> Unit, init: ZoomButton.() -> Unit): ZoomButton {
//    return zoomButton(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.zoomControls(vararg styles: ZoomControls.() -> Unit, init: ZoomControls.() -> Unit): ZoomControls {
//    return zoomControls(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.appWidgetHostView(vararg styles: AppWidgetHostView.() -> Unit, init: _AppWidgetHostView.() -> Unit): AppWidgetHostView {
//    return appWidgetHostView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.absoluteLayout(vararg styles: AbsoluteLayout.() -> Unit, init: _AbsoluteLayout.() -> Unit): AbsoluteLayout {
//    return absoluteLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.webView(vararg styles: WebView.() -> Unit, init: _WebView.() -> Unit): WebView {
//    return webView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.frameLayout(vararg styles: FrameLayout.() -> Unit, init: _FrameLayout.() -> Unit): FrameLayout {
//    return frameLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.gallery(vararg styles: Gallery.() -> Unit, init: _Gallery.() -> Unit): Gallery {
//    return gallery(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.gridLayout(vararg styles: GridLayout.() -> Unit, init: _GridLayout.() -> Unit): GridLayout {
//    return gridLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.gridView(vararg styles: GridView.() -> Unit, init: _GridView.() -> Unit): GridView {
//    return gridView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.horizontalScrollView(vararg styles: HorizontalScrollView.() -> Unit, init: _HorizontalScrollView.() -> Unit): HorizontalScrollView {
//    return horizontalScrollView(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.imageSwitcher(vararg styles: ImageSwitcher.() -> Unit, init: _ImageSwitcher.() -> Unit): ImageSwitcher {
//    return imageSwitcher(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.linearLayout(vararg styles: LinearLayout.() -> Unit, init: _LinearLayout.() -> Unit): LinearLayout {
//    return linearLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.radioGroup(vararg styles: RadioGroup.() -> Unit, init: _RadioGroup.() -> Unit): RadioGroup {
//    return radioGroup(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.relativeLayout(vararg styles: RelativeLayout.() -> Unit, init: _RelativeLayout.() -> Unit): RelativeLayout {
//    return relativeLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.tableLayout(vararg styles: TableLayout.() -> Unit, init: _TableLayout.() -> Unit): TableLayout {
//    return tableLayout(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.tableRow(vararg styles: TableRow.() -> Unit, init: _TableRow.() -> Unit): TableRow {
//    return tableRow(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.textSwitcher(vararg styles: TextSwitcher.() -> Unit, init: _TextSwitcher.() -> Unit): TextSwitcher {
//    return textSwitcher(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.viewAnimator(vararg styles: ViewAnimator.() -> Unit, init: _ViewAnimator.() -> Unit): ViewAnimator {
//    return viewAnimator(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
//
//inline fun ViewManager.viewSwitcher(vararg styles: ViewSwitcher.() -> Unit, init: _ViewSwitcher.() -> Unit): ViewSwitcher {
//    return viewSwitcher(init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
