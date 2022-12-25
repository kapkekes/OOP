package io.github.kapkekes.operations.basic

import io.github.kapkekes.Action
import io.github.kapkekes.Operation

class Division : Operation() {
    override val token: String = "/"
    override val arity: Int = 2
    override val action: Action = { pair -> pair[0] / pair[1] }
}
