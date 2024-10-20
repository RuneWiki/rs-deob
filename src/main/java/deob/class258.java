package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jx")
public class class258 extends class237 {

    @ObfuscatedName("jx.as")
    public HashSet field2636;

    @ObfuscatedName("jx.ay")
    public HashSet field2637;

    @ObfuscatedName("jx.ak")
    public List field2640;

    @ObfuscatedName("jx.cz(Luj;Luj;IZZI)V")
    public void method4507(class527 arg0, class527 arg1, int arg2, boolean arg3, boolean arg4) {
        this.method4170(arg0, arg2, arg4);
        int var6 = arg1.method8412();
        this.field2636 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class232 var8 = new class232();
            try {
                var8.method4091(arg1);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field2636.add(var8);
        }
        int var10 = arg1.method8412();
        this.field2637 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class240 var12 = new class240();
            try {
                var12.method4393(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2637.add(var12);
        }
        this.method4514(arg1, arg3);
    }

    @ObfuscatedName("jx.cy(Luj;ZI)V")
    public void method4514(class527 arg0, boolean arg1) {
        this.field2640 = new LinkedList();
        int var3 = arg0.method8412();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8430();
            class334 var6 = new class334(arg0.method8416());
            boolean var7 = arg0.method8410() == 1;
            if (arg1 || !var7) {
                this.field2640.add(new class243((class334) null, var6, var5, (class250) null));
            }
        }
    }
}
