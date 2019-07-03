package jp.kenschool.myapplication

import android.graphics.Color
import android.provider.CalendarContract.Calendars
import android.provider.CalendarContract.Colors

class CalendarHandler {
    private val CALENDAR_PROJECTION = arrayOf(
            Calendars._ID,
            Calendars.NAME,
            Calendars.ACCOUNT_NAME,
            Calendars.ACCOUNT_TYPE,
            Calendars.CALENDAR_TIME_ZONE,
            Calendars.SYNC_EVENTS,
            Calendars.OWNER_ACCOUNT
    )

    //プロジェクション配列のインデックス（パフォーマンス向上のため静的に定義）
    private val CALENDAR_PROJECTION_IDX_ID = 0
    private val CALENDAR_PROJECTION_IDX_NAME = 1
    private val CALENDAR_PROJECTION_IDX_ACCOUNT_NAME = 2
    private val CALENDAR_PROJECTION_IDX_ACCOUNT_TYPE = 3
    private val CALENDAR_PROJECTION_IDX_CALENDAR_TIME_ZONE = 4
    private val CALENDAR_PROJECTION_IDX_SYNC_EVENTS = 5
    private val CALENDAR_PROJECTION_IDX_OWNER_ACCOUNT  = 6

    //色のプロジェクション
    private val COLOR_PROJECTION = arrayOf(
            Colors._ID,
            Colors.COLOR,
            Colors.COLOR_KEY,
            Colors.COLOR_TYPE,
            Colors.ACCOUNT_TYPE,
            Colors.ACCOUNT_NAME
    )

    //プロジェクション配列のインデックス
    private val COLOR_PROJECTION_IDX_ID = 0
    private val COLOR_PROJECTION_IDX_COROR = 1
    private val COLOR_PROJECTION_IDX_COLOR_KEY = 2
    private val COLOR_PROJECTION_IDX_COLOR_TYPE = 3
    private val COLOR_PROJECTION_IDX_ACCOUNT_NAME = 4
    private val COLOR_PROJECTION_IDX_ACCOUNT_TYPE = 5

    fun fetchCalendarData(){

    }

    fun fetchColorData(){

    }
}