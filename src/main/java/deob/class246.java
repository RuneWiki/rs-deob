package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("iu")
public class class246 extends class225 {

    @ObfuscatedName("iu.z")
    public HashSet field2872;

    @ObfuscatedName("iu.r")
    public HashSet field2873;

    @ObfuscatedName("iu.u")
    public List field2874;

    @ObfuscatedName("iu.bo(Lqt;Lqt;IZI)V")
    public void method4610(class443 arg0, class443 arg1, int arg2, boolean arg3) {
        this.method4272(arg0, arg2);
        int var5 = arg1.method7049();
        this.field2872 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class220 var7 = new class220();
            try {
                var7.method4204(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2872.add(var7);
        }
        int var9 = arg1.method7049();
        this.field2873 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class228 var11 = new class228();
            try {
                var11.method4501(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2873.add(var11);
        }
        this.method4611(arg1, arg3);
    }

    @ObfuscatedName("iu.bx(Lqt;ZI)V")
    public void method4611(class443 arg0, boolean arg1) {
        this.field2874 = new LinkedList();
        int var3 = arg0.method7049();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method7066();
            class289 var6 = new class289(arg0.method7052());
            boolean var7 = arg0.method7047() == 1;
            if (arg1 || !var7) {
                this.field2874.add(new class231((class289) null, var6, var5, (class238) null));
            }
        }
    }
}
