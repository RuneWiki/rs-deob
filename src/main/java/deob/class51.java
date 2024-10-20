package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("az")
public class class51 extends class52 {

    @ObfuscatedName("az.i")
    public AudioFormat field1096;

    @ObfuscatedName("az.w")
    public SourceDataLine field1095;

    @ObfuscatedName("az.f")
    public int field1094;

    @ObfuscatedName("az.e")
    public byte[] field1097;

    @ObfuscatedName("az.i(Ljava/awt/Component;)V")
    public void method943(Component arg0) {
        this.field1096 = new AudioFormat((float) Statics.field1100, 16, Statics.field1099 ? 2 : 1, true, false);
        this.field1097 = new byte[0x100 << (Statics.field1099 ? 2 : 1)];
    }

    @ObfuscatedName("az.w(I)V")
    public void method944(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1096, arg0 << (Statics.field1099 ? 2 : 1));
            this.field1095 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1095.open();
            this.field1095.start();
            this.field1094 = arg0;
        } catch (LineUnavailableException var11) {
            if (class124.method737(arg0) == 1) {
                this.field1095 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method944(var10);
        }
    }

    @ObfuscatedName("az.f()I")
    public int method935() {
        return this.field1094 - (this.field1095.available() >> (Statics.field1099 ? 2 : 1));
    }

    @ObfuscatedName("az.e()V")
    public void method936() {
        int var1 = 256;
        if (Statics.field1099) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1104[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1097[var2 * 2] = (byte) (var3 >> 8);
            this.field1097[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1095.write(this.field1097, 0, var1 << 1);
    }

    @ObfuscatedName("az.t()V")
    public void method938() {
        if (this.field1095 != null) {
            this.field1095.close();
            this.field1095 = null;
        }
    }

    @ObfuscatedName("az.d()V")
    public void method949() {
        this.field1095.flush();
    }
}
