# MiPushFramework

在任何非 MIUI 设备上体验小米系统级推送。

![](https://raw.githubusercontent.com/Trumeet/MiPushFramework/master/art/screenshot.png)


## 什么是小米系统级推送，为什么会有这个项目

小米推送是小米公司提供的推送服务。就我个人看来非常喜欢这个服务，而且许多App都在使用（如酷安）。

它非常轻量，会在 MIUI 设备上自动启用系统推送，而非 MIUI 设备则在后台保持长连接。



### 系统级推送

类似 GCM，小米推送的系统级推送是在 MIUI 完成的。应用在启动时，会判断如果是 MIUI ROM 则向系统注册推送，推送工作都由系统完成，应用无需后台，更省电。

然而在非 MIUI，每个使用小米推送的应用都会在后台启动一个 `XMPushService`， 10个应用就有10个，20个就有20个服务.. 非常耗电耗内存费流量。



### 本项目的意义

本项目就是想让任何不用MIUI的用户都能用上小米的系统推送，这样既能保证推送，又保证了无需后台。



###  Others

我只做了推送部分，因为怕别的影响小米利益等问题，同时其他的也是不必要的。





## 缺陷

* 不支持 MIUI。
* 在 Android O 上，可能由于 **后台限制** 导致推送服务中断，请尝试对本应用取消后台限制
* 如果使用了绿色守护小米推送处方会无法启动推送服务
* 不建议使用 黑域、绿色守护、Xposed一些模块 对本应用做操作，可能导致推送不稳定
* 只有推送功能。其他完整功能（如查找手机）请体验 MIUI
* 对本应用启用电池优化会无法后台



## 优点

* 简单，安装非常简单，无需 Root、Xposed、ROM 支持
* 使用后，其他应用的`XMPushService`会自动禁用，就像在 MIUI
* `XMPushService`禁用后，还能保证推送。



## 开始使用

安装步骤非常简单 ~~（目前）~~：

* 前往 Release 标签，下载最新的 Release APK
* 安装到手机
* （6.0+）设置 -> 电池 ->（菜单）电池优化，找到 XiaomiPushServiceFramework，取消优化
* 启动它（感觉说了一堆废话 2333）
* 去 设置 -> 开发者选项 -> 正在运行的服务 看一下本应用的 `XMPushService` 是否已启动，如果已启动，继续。未启动检查一下上面的 **缺陷** 部分，有没有应用处方等。如果没有，请参考下面的 **反馈问题** 章节，向我反馈问题。
* 强行停止有小米推送的应用，可能需要清除它们的数据（主要是删掉小米推送 SP）。
* 打开需要推送的应用，用 `MyAndroidTools` 等工具观察它们是否已将自身的 `XMPushService` 禁用。如果已禁用，基本就可以使用了。



## 反馈问题

如需反馈问题，请务必在 Issues 中带上如下内容：

* 你的 ROM 是什么，Android 版本是什么
* 有没有使用框架等工具

同时，建议带上 使用 LogCat 工具 捕获的 `com.xiaomi.xmsf` 日志。



## 参与项目

欢迎提交 PR、Issues 帮助这个项目更好。



## TODO

- [ ] 缺一个图标
- [ ] 对每个应用，用户可以选择启用/停止它们的推送服务
- [ ] 在注册推送时，用户可以拒绝它们
- [*] 设置向导
- [ ] 统一的推送控制
- [*] 通过修改 build.prop 达到伪装 MIUI 的效果（主要是应对京东等内建判断的应用）

## 感谢

* @Rachel030219 提供文件

# License

GPL v3，有些狗不遵守开源协议（非本项目），防君子不防小人，请**务必**遵守开源协议！！！
