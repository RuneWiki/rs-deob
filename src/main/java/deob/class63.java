package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bu")
public class class63 extends class50 {

    @ObfuscatedName("bu.g")
    public AudioFormat field1181;

    @ObfuscatedName("bu.s")
    public SourceDataLine field1183;

    @ObfuscatedName("bu.aa")
    public int field1182;

    @ObfuscatedName("bu.ar")
    public byte[] field1180;

    @ObfuscatedName("bu.g(Ljava/awt/Component;)V")
    public void method923(Component arg0) {
        this.field1181 = new AudioFormat((float) Statics.field1071, 16, Statics.field1069 ? 2 : 1, true, false);
        this.field1180 = new byte[0x100 << (Statics.field1069 ? 2 : 1)];
    }

    @ObfuscatedName("bu.s(I)V")
    public void method914(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1181, arg0 << (Statics.field1069 ? 2 : 1));
            this.field1183 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1183.open();
            this.field1183.start();
            this.field1182 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1183 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method914(var17);
        }
    }

    @ObfuscatedName("bu.h()I")
    public int method912() {
        return this.field1182 - (this.field1183.available() >> (Statics.field1069 ? 2 : 1));
    }

    @ObfuscatedName("bu.m()V")
    public void method913() {
        int var1 = 256;
        if (Statics.field1069) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1068[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1180[var2 * 2] = (byte) (var3 >> 8);
            this.field1180[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1183.write(this.field1180, 0, var1 << 1);
    }

    @ObfuscatedName("bu.u()V")
    public void method910() {
        if (this.field1183 != null) {
            this.field1183.close();
            this.field1183 = null;
        }
    }

    @ObfuscatedName("bu.j()V")
    public void method915() {
        this.field1183.flush();
    }
}
