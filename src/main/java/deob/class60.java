package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bd")
public class class60 extends class58 {

    @ObfuscatedName("bd.ai")
    public AudioFormat field1082;

    @ObfuscatedName("bd.aq")
    public SourceDataLine field1080;

    @ObfuscatedName("bd.an")
    public int field1081;

    @ObfuscatedName("bd.ay")
    public byte[] field1079;

    @ObfuscatedName("bd.l(Ljava/awt/Component;I)V")
    public void method1047(Component arg0) {
        this.field1082 = new AudioFormat((float) Statics.field1054, 16, Statics.field1063 ? 2 : 1, true, false);
        this.field1079 = new byte[0x100 << (Statics.field1063 ? 2 : 1)];
    }

    @ObfuscatedName("bd.c(IS)V")
    public void method997(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1082, arg0 << (Statics.field1063 ? 2 : 1));
            this.field1080 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1080.open();
            this.field1080.start();
            this.field1081 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1080 = null;
                throw var11;
            } else {
                this.method997(class158.method71(arg0));
            }
        }
    }

    @ObfuscatedName("bd.m(I)I")
    public int method1008() {
        return this.field1081 - (this.field1080.available() >> (Statics.field1063 ? 2 : 1));
    }

    @ObfuscatedName("bd.r()V")
    public void method1048() {
        int var1 = 256;
        if (Statics.field1063) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1067[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1079[var2 * 2] = (byte) (var3 >> 8);
            this.field1079[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1080.write(this.field1079, 0, var1 << 1);
    }

    @ObfuscatedName("bd.u(B)V")
    public void method1010() {
        if (this.field1080 != null) {
            this.field1080.close();
            this.field1080 = null;
        }
    }

    @ObfuscatedName("bd.j(I)V")
    public void method1033() {
        this.field1080.flush();
    }
}
