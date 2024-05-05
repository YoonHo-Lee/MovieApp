package yoonho.test.movieapp.library.network.retrofit

import yoonho.test.movieapp.library.network.model.ApiResult
import yoonho.test.movieapp.library.network.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}
