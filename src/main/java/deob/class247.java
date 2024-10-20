package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("iq")
public class class247 extends class226 {

    @ObfuscatedName("iq.w")
    public HashSet field2917;

    @ObfuscatedName("iq.b")
    public HashSet field2918;

    @ObfuscatedName("iq.t")
    public List field2919;

    @ObfuscatedName("iq.bu(Lpx;Lpx;IZI)V")
    public void method4478(class440 arg0, class440 arg1, int arg2, boolean arg3) {
        this.method4127(arg0, arg2);
        int var5 = arg1.method7082();
        this.field2917 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class221 var7 = new class221();
            try {
                var7.method4073(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2917.add(var7);
        }
        int var9 = arg1.method7082();
        this.field2918 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class229 var11 = new class229();
            try {
                var11.method4368(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2918.add(var11);
        }
        this.method4473(arg1, arg3);
    }

    @ObfuscatedName("iq.bq(Lpx;ZI)V")
    public void method4473(class440 arg0, boolean arg1) {
        this.field2919 = new LinkedList();
        int var3 = arg0.method7082();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method6910();
            class290 var6 = new class290(arg0.method6898());
            boolean var7 = arg0.method7071() == 1;
            if (arg1 || !var7) {
                this.field2919.add(new class232((class290) null, var6, var5, (class239) null));
            }
        }
    }
}
