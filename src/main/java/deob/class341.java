package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("nd")
public class class341 {

    @ObfuscatedName("nd.aq")
    public class378 field3632;

    @ObfuscatedName("nd.aw")
    public class378 field3626;

    @ObfuscatedName("nd.al")
    public class378 field3627;

    @ObfuscatedName("nd.ai")
    public class378 field3633;

    @ObfuscatedName("nd.ar")
    public class378 field3629;

    @ObfuscatedName("nd.as")
    public class350[][] field3634;

    @ObfuscatedName("nd.az")
    public Map field3631 = new HashMap();

    @ObfuscatedName("nd.ao")
    public class304 field3625 = new class304(200);

    @ObfuscatedName("nd.au")
    public class304 field3628 = new class304(50);

    @ObfuscatedName("nd.ak")
    public class304 field3638 = new class304(20);

    @ObfuscatedName("nd.ah")
    public class304 field3635 = new class304(8);

    @ObfuscatedName("nd.aj")
    public class443 field3636 = new class443(10, class441.field4713);

    @ObfuscatedName("nd.af")
    public class443 field3637 = new class443(10, class441.field4713);

    public class341(class378 arg0, class378 arg1, class378 arg2, class378 arg3, class378 arg4) {
        int var6 = 0;
        if (arg0 != null) {
            this.field3632 = arg0;
            this.field3627 = arg1;
            this.field3633 = arg2;
            this.field3629 = arg3;
            this.field3626 = arg4;
            var6 = this.field3632.method6454();
        }
        this.field3634 = new class350[var6][];
        Statics.field1482 = new boolean[var6];
    }

    @ObfuscatedName("nd.aq(II)Lng;")
    public class350 method5777(int arg0) {
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (this.field3634[var2] == null || this.field3634[var2][var3] == null) {
            boolean var4 = this.method5783(var2);
            if (!var4) {
                return null;
            }
        }
        return this.field3634[var2][var3];
    }

    @ObfuscatedName("nd.aw(III)Lng;")
    public class350 method5779(int arg0, int arg1) {
        class350 var3 = this.method5777(arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3863 == null || arg1 >= var3.field3863.length) {
            return null;
        } else {
            return var3.field3863[arg1];
        }
    }

    @ObfuscatedName("nd.al(II)Z")
    public boolean method5783(int arg0) {
        if (Statics.field1482[arg0]) {
            return true;
        } else if (this.field3632.method6422(arg0)) {
            int var2 = this.field3632.method6429(arg0);
            if (var2 == 0) {
                Statics.field1482[arg0] = true;
                return true;
            }
            if (this.field3634[arg0] == null) {
                this.field3634[arg0] = new class350[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (this.field3634[arg0][var3] == null) {
                    byte[] var4 = this.field3632.method6489(arg0, var3);
                    if (var4 != null) {
                        this.field3634[arg0][var3] = new class350();
                        this.field3634[arg0][var3].field3725 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            this.field3634[arg0][var3].method6274(new class534(var4));
                        } else {
                            this.field3634[arg0][var3].method6195(new class534(var4));
                        }
                        if (this.field3626 != null) {
                            byte[] var5 = this.field3626.method6489(arg0, var3);
                            if (var5 != null && var5.length > 0) {
                                this.field3634[arg0][var3].method6137(new class534(var5));
                                this.field3631.put(this.field3634[arg0][var3].field3847, arg0);
                            }
                        }
                    }
                }
            }
            Statics.field1482[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nd.ai(II)V")
    public void method5780(int arg0) {
        if (arg0 == -1 || !Statics.field1482[arg0]) {
            return;
        }
        this.field3632.method6432(arg0);
        if (this.field3634[arg0] == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3634[arg0].length; var2++) {
            if (this.field3634[arg0][var2] != null) {
                this.field3634[arg0][var2] = null;
            }
        }
        this.field3634[arg0] = null;
        Statics.field1482[arg0] = false;
    }

    @ObfuscatedName("nd.ar(I)V")
    public void method5782() {
        this.field3625.method5418();
        this.field3628.method5418();
        this.field3638.method5418();
        this.field3635.method5418();
    }
}
