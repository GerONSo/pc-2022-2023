sealed interface State {
    object Common: State
    object Loading: State
    object Finished: State
}