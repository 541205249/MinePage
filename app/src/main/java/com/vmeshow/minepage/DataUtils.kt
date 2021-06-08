package com.vmeshow.minepage

import java.util.*

object DataUtils {
    @JvmStatic
    fun initIconDataList(): List<IconData> {
        val iconDataList: MutableList<IconData> = ArrayList()
        var iconData = IconData()
        iconData.title = "我的动态"
        iconData.icon_res = R.mipmap.me_dynamic_two
        iconDataList.add(iconData)
        iconData = IconData()
        iconData.title = "历史记录"
        iconData.icon_res = R.mipmap.me_history_two
        iconDataList.add(iconData)
        iconData = IconData()
        iconData.title = "管家一对一"
        iconData.icon_res = R.mipmap.me_housekeeper_two
        iconDataList.add(iconData)
        iconData = IconData()
        iconData.title = "我的团队"
        iconData.icon_res = R.mipmap.me_team_two
        iconDataList.add(iconData)
        iconData = IconData()
        iconData.title = "福利中心"
        iconData.icon_res = R.mipmap.me_welfare_center_two
        iconDataList.add(iconData)
        iconData = IconData()
        iconData.title = "收藏夹"
        iconData.icon_res = R.mipmap.me_store_two
        iconDataList.add(iconData)
        iconData = IconData()
        iconData.title = "帮助中心"
        iconData.icon_res = R.mipmap.me_help_two
        iconDataList.add(iconData)
        iconData = IconData()
        iconData.title = "产品防伪"
        iconData.icon_res = R.mipmap.me_scanning_two
        iconDataList.add(iconData)
        return iconDataList
    }
}