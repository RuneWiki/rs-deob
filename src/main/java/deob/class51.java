package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ag")
public class class51 extends class52 {

    @ObfuscatedName("ag.d")
    public AudioFormat field1089;

    @ObfuscatedName("ag.g")
    public SourceDataLine field1086;

    @ObfuscatedName("ag.a")
    public int field1088;

    @ObfuscatedName("ag.t")
    public byte[] field1087;

    @ObfuscatedName("ag.d(Ljava/awt/Component;)V")
    public void method922(Component arg0) {
        this.field1089 = new AudioFormat((float) Statics.field2328, 16, Statics.field1178 ? 2 : 1, true, false);
        this.field1087 = new byte[0x100 << (Statics.field1178 ? 2 : 1)];
    }

    @ObfuscatedName("ag.g(I)V")
    public void method906(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1089, arg0 << (Statics.field1178 ? 2 : 1));
            this.field1086 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1086.open();
            this.field1086.start();
            this.field1088 = arg0;
        } catch (LineUnavailableException var11) {
            if (class124.method1319(arg0) == 1) {
                this.field1086 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method906(var10);
        }
    }

    @ObfuscatedName("ag.a()I")
    public int method907() {
        return this.field1088 - (this.field1086.available() >> (Statics.field1178 ? 2 : 1));
    }

    @ObfuscatedName("ag.t()V")
    public void method908() {
        int var1 = 256;
        if (Statics.field1178) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1091[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1087[var2 * 2] = (byte) (var3 >> 8);
            this.field1087[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1086.write(this.field1087, 0, var1 << 1);
    }

    @ObfuscatedName("ag.f()V")
    public void method920() {
        if (this.field1086 != null) {
            this.field1086.close();
            this.field1086 = null;
        }
    }

    @ObfuscatedName("ag.c()V")
    public void method904() {
        this.field1086.flush();
    }
}
