package taost.smart.smartcat.com.tinker;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class SampleApplication extends TinkerApplication {

    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "taost.smart.smartcat.com.tinker.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}