package deob;

import java.util.Iterator;

@ObfuscatedName("rs")
public class class448 extends class446 {

    @ObfuscatedName("rs.ab")
    public class389 field4805;

    @ObfuscatedName("rs.ay")
    public class389 field4802;

    @ObfuscatedName("rs.ac")
    public class389 field4804;

    public class448(class446 arg0, class389 arg1, class389 arg2, class389 arg3) {
        super(arg0);
        this.field4805 = arg1;
        this.field4802 = arg2;
        this.field4804 = arg3;
        this.field4797 = "LoadSongTask";
    }

    @ObfuscatedName("rs.ab(I)Z")
    public boolean method7665() {
        int var1 = 0;
        Iterator var2 = class333.field3565.iterator();
        while (true) {
            while (var2.hasNext()) {
                class345 var3 = (class345) var2.next();
                if (var3 != null && var3.field3683.field3605 > 1 && var3.field3683.method5748()) {
                    this.method7672("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3679) {
                    var1++;
                } else {
                    try {
                        if (var3.field3686 == null || var3.field3675 == -1 || var3.field3673 == -1) {
                            var1++;
                        } else {
                            if (var3.field3685 == null) {
                                var3.field3685 = class342.method5891(var3.field3686, var3.field3675, var3.field3673);
                                if (var3.field3685 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3684 == null) {
                                var3.field3684 = new class46(this.field4804, this.field4802);
                            }
                            if (var3.field3683.method5725(var3.field3685, this.field4805, var3.field3684)) {
                                var1++;
                                var3.field3679 = true;
                                var3.field3683.method5695();
                            }
                        }
                    } catch (Exception var5) {
                        class575.method2216((String) null, var5);
                        this.method7672(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class333.field3565.size()) {
                return true;
            }
            return false;
        }
    }
}
