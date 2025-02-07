class PushLibraryImpl(reactContext: ReactApplicationContext) : MyModuleSpec(reactContext) {
// declare an instance of the implementation and use it in all the methods
private var implementation: PushLibraryImpl = PushLibraryImpl()

override fun getName(): String = PushLibraryImpl.NAME

override fun foo(a: Double, b: Double, promise: Promise) {
    // Use the implementation instance to execute the function.
    implementation.foo(a, b, promise)
}
}
