package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("b")
public class class17 {

    @ObfuscatedName("b.i")
    public byte[] field247 = new byte[4];

    @ObfuscatedName("b.c")
    public int field246;

    @ObfuscatedName("b.h")
    public class133 field242;

    @ObfuscatedName("b.v")
    public DataInputStream field243;

    @ObfuscatedName("b.q")
    public int field241;

    @ObfuscatedName("b.s")
    public byte[] field245;

    @ObfuscatedName("b.g")
    public int field249;

    @ObfuscatedName("b.u")
    public long field248;

    public class17(class123 arg0, URL arg1) {
        this.field242 = arg0.method2513(arg1);
        this.field246 = 0;
        this.field248 = class103.method1055() + 30000L;
    }

    @ObfuscatedName("b.i(I)[B")
    public byte[] method160() throws IOException {
        if (class103.method1055() > this.field248) {
            throw new IOException();
        }
        if (this.field246 == 0) {
            if (this.field242.field2060 == 2) {
                throw new IOException();
            }
            if (this.field242.field2060 == 1) {
                this.field243 = (DataInputStream) this.field242.field2064;
                this.field246 = 1;
            }
        }
        if (this.field246 == 1) {
            int var1 = this.field243.available();
            if (var1 > 0) {
                if (this.field241 + var1 > 4) {
                    var1 = 4 - this.field241;
                }
                this.field241 += this.field243.read(this.field247, this.field241, var1);
                if (this.field241 == 4) {
                    int var2 = (new class107(this.field247)).method2156();
                    this.field245 = new byte[var2];
                    this.field246 = 2;
                }
            }
        }
        if (this.field246 == 2) {
            int var3 = this.field243.available();
            if (var3 > 0) {
                if (this.field249 + var3 > this.field245.length) {
                    var3 = this.field245.length - this.field249;
                }
                this.field249 += this.field243.read(this.field245, this.field249, var3);
                if (this.field249 == this.field245.length) {
                    return this.field245;
                }
            }
        }
        return null;
    }
}
