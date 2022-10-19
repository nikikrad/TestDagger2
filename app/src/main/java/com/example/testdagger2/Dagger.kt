package com.example.testdagger2

import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {

    val nikita: Nikita
}

@Module
object AppModule{

    @Provides
    fun provideNikita(
        name: Name,
        job: Job,
        studies: Studies
    ): Nikita{
        return Nikita(name = name, job = job, studies = studies)
    }

    @Provides
    fun provideName(): Name{
        return Name()
    }
    @Provides
    fun provideJob(): Job{
        return Job()
    }
    @Provides
    fun provideStudies(): Studies{
        return Studies()
    }
}