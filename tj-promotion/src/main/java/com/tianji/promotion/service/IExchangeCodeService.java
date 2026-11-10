package com.tianji.promotion.service;

import com.tianji.common.domain.dto.PageDTO;
import com.tianji.promotion.domain.po.Coupon;
import com.tianji.promotion.domain.po.ExchangeCode;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tianji.promotion.domain.query.CodeQuery;
import com.tianji.promotion.domain.vo.ExchangeCodeVO;

/**
 * <p>
 * 兑换码 服务类
 * </p>
 *
 * @author Ayanami Z41
 * @since 2026-11-08
 */
public interface IExchangeCodeService extends IService<ExchangeCode> {

    void asyncGenerateCode(Coupon coupon);

    boolean updateExchangeMark(long serialNum, boolean b);

    PageDTO<ExchangeCodeVO> queryCodePage(CodeQuery query);

    Long exchangeTargetId(long serialNum);
}
