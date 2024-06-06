package io.vithor.libs.morphine.codegen.koin

import com.google.auto.service.AutoService
import net.ltgt.gradle.incap.IncrementalAnnotationProcessor
import net.ltgt.gradle.incap.IncrementalAnnotationProcessorType
import javax.annotation.processing.Processor
import javax.annotation.processing.SupportedOptions
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion

@AutoService(Processor::class) // For registering the service
@SupportedSourceVersion(SourceVersion.RELEASE_8) // to support Java 8
@SupportedOptions(InjectorGenerator.KAPT_KOTLIN_GENERATED_OPTION_NAME)
@IncrementalAnnotationProcessor(IncrementalAnnotationProcessorType.DYNAMIC)
class KoinInjectorGenerator : InjectorGenerator() {
    override fun getSupportedOptions() = setOf(
        KoinInjectorGenerator::class.java.canonicalName
    )
}