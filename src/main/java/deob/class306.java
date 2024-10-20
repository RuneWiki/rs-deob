package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lq")
public class class306 extends class285 {

    @ObfuscatedName("lq.af")
    public HashSet field3275;

    @ObfuscatedName("lq.ar")
    public HashSet field3273;

    @ObfuscatedName("lq.ab")
    public List field3272;

    @ObfuscatedName("lq.ct(Lvl;Lvl;IZB)V")
    public void method5843(class558 arg0, class558 arg1, int arg2, boolean arg3) {
        this.method5502(arg0, arg2);
        int var5 = arg1.method9260();
        this.field3275 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class280 var7 = new class280();
            try {
                var7.method5434(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3275.add(var7);
        }
        int var9 = arg1.method9260();
        this.field3273 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class288 var11 = new class288();
            try {
                var11.method5742(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3273.add(var11);
        }
        this.method5844(arg1, arg3);
    }

    @ObfuscatedName("lq.cc(Lvl;ZB)V")
    public void method5844(class558 arg0, boolean arg1) {
        this.field3272 = new LinkedList();
        int var3 = arg0.method9260();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method9278();
            class351 var6 = new class351(arg0.method9264());
            boolean var7 = arg0.method9258() == 1;
            if (arg1 || !var7) {
                this.field3272.add(new class291((class351) null, var6, var5, (class298) null));
            }
        }
    }
}
