package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aw")
public class class39 extends class27 {

    @ObfuscatedName("aw.v")
    public HashSet field340;

    @ObfuscatedName("aw.n")
    public HashSet field338;

    @ObfuscatedName("aw.x")
    public List field339;

    @ObfuscatedName("aw.cg(Lkp;Lkp;IZS)V")
    public void method577(class301 arg0, class301 arg1, int arg2, boolean arg3) {
        this.method288(arg0, arg2);
        int var5 = arg1.method5124();
        this.field340 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method156(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field340.add(var7);
        }
        int var9 = arg1.method5124();
        this.field338 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method587(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field338.add(var11);
        }
        this.method578(arg1, arg3);
    }

    @ObfuscatedName("aw.cr(Lkp;ZI)V")
    public void method578(class301 arg0, boolean arg1) {
        this.field339 = new LinkedList();
        int var3 = arg0.method5124();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5146();
            class214 var6 = new class214(arg0.method5134());
            boolean var7 = arg0.method5129() == 1;
            if (arg1 || !var7) {
                this.field339.add(new class19((class214) null, var6, var5, (class29) null));
            }
        }
    }
}
