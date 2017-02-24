#language:zh-CN

  功能: 登录功能
  @Automation
    场景: 用正确账号密码登录
      假如 我用账号"test1"，密码"test2"登录
      那么 我能登录成功
  @p0
  场景大纲: 多用户登录
        假如 我打开"http://mail.163.com"页面
        当 我用账号"<username>"，和密码"<pwd>"登录
        当 我点击登录按钮
        那么 我能登录成功

        例子:
      |username   | pwd   |
      |  test3    | pwd3  |
      |  test4    | pwd4  |
      |  test5    | pwd5  |
      |  test6    | pwd6  |