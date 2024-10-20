package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lt")
public class class302 extends class281 {

    @ObfuscatedName("lt.ap")
    public HashSet field3244;

    @ObfuscatedName("lt.ae")
    public HashSet field3242;

    @ObfuscatedName("lt.ax")
    public List field3243;

    @ObfuscatedName("lt.cx(Lua;Lua;IZS)V")
    public void method5461(class546 arg0, class546 arg1, int arg2, boolean arg3) {
        this.method5165(arg0, arg2);
        int var5 = arg1.method8798();
        this.field3244 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class276 var7 = new class276();
            try {
                var7.method5039(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3244.add(var7);
        }
        int var9 = arg1.method8798();
        this.field3242 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class284 var11 = new class284();
            try {
                var11.method5355(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3242.add(var11);
        }
        this.method5463(arg1, arg3);
    }

    @ObfuscatedName("lt.dj(Lua;ZI)V")
    public void method5463(class546 arg0, boolean arg1) {
        this.field3243 = new LinkedList();
        int var3 = arg0.method8798();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8814();
            class347 var6 = new class347(arg0.method8801());
            boolean var7 = arg0.method8796() == 1;
            if (arg1 || !var7) {
                this.field3243.add(new class287((class347) null, var6, var5, (class294) null));
            }
        }
    }
}
