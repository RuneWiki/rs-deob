package deob;

import java.util.Iterator;

@ObfuscatedName("ql")
public class class424 extends class422 {

    @ObfuscatedName("ql.ac")
    public class374 field4584;

    @ObfuscatedName("ql.al")
    public class374 field4586;

    @ObfuscatedName("ql.ab")
    public class374 field4583;

    public class424(class422 arg0, class374 arg1, class374 arg2, class374 arg3) {
        super(arg0);
        this.field4584 = arg1;
        this.field4586 = arg2;
        this.field4583 = arg3;
        this.field4573 = "LoadSongTask";
    }

    @ObfuscatedName("ql.ac(B)Z")
    public boolean method7059() {
        int var1 = 0;
        Iterator var2 = class320.field3434.iterator();
        while (true) {
            while (var2.hasNext()) {
                class332 var3 = (class332) var2.next();
                if (var3 != null && var3.field3539.field3451 > 1 && var3.field3539.method5475()) {
                    this.method7079("Attempted to load patches of already loading midiplayer!");
                    return true;
                }
                if (var3 == null || var3.field3548) {
                    var1++;
                } else {
                    try {
                        if (var3.field3545 == null || var3.field3540 == -1 || var3.field3541 == -1) {
                            var1++;
                        } else {
                            if (var3.field3549 == null) {
                                var3.field3549 = class329.method5592(var3.field3545, var3.field3540, var3.field3541);
                                if (var3.field3549 == null) {
                                    continue;
                                }
                            }
                            if (var3.field3550 == null) {
                                var3.field3550 = new class46(this.field4583, this.field4586);
                            }
                            if (var3.field3539.method5413(var3.field3549, this.field4584, var3.field3550)) {
                                var1++;
                                var3.field3548 = true;
                                var3.field3539.method5419();
                            }
                        }
                    } catch (Exception var5) {
                        class556.method3321((String) null, var5);
                        this.method7079(var5.getMessage());
                        return true;
                    }
                }
            }
            if (var1 == class320.field3434.size()) {
                return true;
            }
            return false;
        }
    }
}
