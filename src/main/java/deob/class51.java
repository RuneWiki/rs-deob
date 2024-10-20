package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ag")
public class class51 extends class52 {

    @ObfuscatedName("ag.j")
    public AudioFormat field1093;

    @ObfuscatedName("ag.f")
    public SourceDataLine field1092;

    @ObfuscatedName("ag.o")
    public int field1094;

    @ObfuscatedName("ag.h")
    public byte[] field1095;

    @ObfuscatedName("ag.j(Ljava/awt/Component;)V")
    public void method922(Component arg0) {
        this.field1093 = new AudioFormat((float) Statics.field277, 16, Statics.field2015 ? 2 : 1, true, false);
        this.field1095 = new byte[0x100 << (Statics.field2015 ? 2 : 1)];
    }

    @ObfuscatedName("ag.f(I)V")
    public void method923(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1093, arg0 << (Statics.field2015 ? 2 : 1));
            this.field1092 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1092.open();
            this.field1092.start();
            this.field1094 = arg0;
        } catch (LineUnavailableException var4) {
            if (class124.method409(arg0) == 1) {
                this.field1092 = null;
                throw var4;
            } else {
                this.method923(class124.method2058(arg0));
            }
        }
    }

    @ObfuscatedName("ag.o()I")
    public int method934() {
        return this.field1094 - (this.field1092.available() >> (Statics.field2015 ? 2 : 1));
    }

    @ObfuscatedName("ag.h()V")
    public void method936() {
        int var1 = 256;
        if (Statics.field2015) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1096[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1095[var2 * 2] = (byte) (var3 >> 8);
            this.field1095[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1092.write(this.field1095, 0, var1 << 1);
    }

    @ObfuscatedName("ag.u()V")
    public void method924() {
        if (this.field1092 != null) {
            this.field1092.close();
            this.field1092 = null;
        }
    }

    @ObfuscatedName("ag.a()V")
    public void method927() {
        this.field1092.flush();
    }
}
