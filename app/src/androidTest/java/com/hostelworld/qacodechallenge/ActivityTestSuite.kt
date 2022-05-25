package com.hostelworld.qacodechallenge

import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(LoginActivityTest::class, MainActivityTest::class)
class ActivityTestSuite
