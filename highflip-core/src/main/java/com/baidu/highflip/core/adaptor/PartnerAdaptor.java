package com.baidu.highflip.core.adaptor;

import com.baidu.highflip.core.entity.runtime.Partner;

public interface PartnerAdaptor {

    Partner getPartner(Partner partner);

    int getPartnerCount();

    Partner getPartnerByIndex(int index, Partner partner);
}
