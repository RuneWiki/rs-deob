package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ll")
public class class305 extends class284 {

    @ObfuscatedName("ll.as")
    public HashSet field3221;

    @ObfuscatedName("ll.aw")
    public HashSet field3222;

    @ObfuscatedName("ll.af")
    public List field3223;

    @ObfuscatedName("ll.cc(Lvg;Lvg;IZB)V")
    public void method5501(class549 arg0, class549 arg1, int arg2, boolean arg3) {
        this.method5172(arg0, arg2);
        int var5 = arg1.method8968();
        this.field3221 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class279 var7 = new class279();
            try {
                var7.method5081(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3221.add(var7);
        }
        int var9 = arg1.method8968();
        this.field3222 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class287 var11 = new class287();
            try {
                var11.method5387(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3222.add(var11);
        }
        this.method5500(arg1, arg3);
    }

    @ObfuscatedName("ll.cs(Lvg;ZS)V")
    public void method5500(class549 arg0, boolean arg1) {
        this.field3223 = new LinkedList();
        int var3 = arg0.method8968();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8863();
            class350 var6 = new class350(arg0.method8803());
            boolean var7 = arg0.method9025() == 1;
            if (arg1 || !var7) {
                this.field3223.add(new class290((class350) null, var6, var5, (class297) null));
            }
        }
    }
}
