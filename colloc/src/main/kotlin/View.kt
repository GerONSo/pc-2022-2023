class View {

    private var state: State = State.Common

    fun startLoading() {
        state = State.Loading
    }

    fun finishLoading() {
        state = State.Finished
    }
}
