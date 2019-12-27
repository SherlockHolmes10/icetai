                
# 数据字典ipuc_tutor

### 导师信息表

|  字段 | 描述 | 数据类型 | 是否主键 | 是否为Null | 是否唯一 |
|---|----|-----|---|---|---|
| uid  | 用户ID | varchar(64) | √ | × | √ |
| sid  | 学员ID | varchar(64) | √ | × | √ |
| mid  | 导师ID | varchar(64) | √ | × | √ |
| username  | 课程ID | varchar(64) | √ | × | √ |
| des  | 简介 | varchar(500) | √ | × | × |
| avatar  | 头像 | varchar(200) | √ | × | × |
| address  | 地址 | varchar(500) | √ | × | × |
| major_id  | 专业ID | varchar(64) | √ | × | √ |
| spe_column  | 专栏 | int(11) | √ | × | × |
| fans  | 热度 | int(11) | √ | × | × |
| follow  | 关注 | int(11) | √ | × | × |
| broadcast  | 直播 | int(11) | √ | × | × |
| chat  | 聊天 | int(11) | √ | × | × |
| created_at | 创建时间 | timestamp | × | × | × |
| updated_at | 更新时间 | timestamp | × | × | × |
| created_by | 创建ID | varchar(64) | × | × | × |
| updated_by | 更新ID | varchar(64) | × | × | × |
```