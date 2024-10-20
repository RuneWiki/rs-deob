package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class19 {

    @ObfuscatedName("x.e")
    public int field254;

    @ObfuscatedName("x.w")
    public class147 field258;

    @ObfuscatedName("x.f")
    public DataInputStream field255;

    @ObfuscatedName("x.s")
    public byte[] field253 = new byte[4];

    @ObfuscatedName("x.p")
    public int field256;

    @ObfuscatedName("x.h")
    public byte[] field257;

    @ObfuscatedName("x.g")
    public int field259;

    @ObfuscatedName("x.a")
    public long field260;

    public class19(class137 arg0, URL arg1) {
        this.field258 = arg0.method2704(arg1);
        this.field254 = 0;
        this.field260 = class116.method2794() + 30000L;
    }

    @ObfuscatedName("x.e(I)[B")
    public byte[] method178() throws IOException {
        if (class116.method2794() > this.field260) {
            throw new IOException();
        }
        if (this.field254 == 0) {
            if (this.field258.field2214 == 2) {
                throw new IOException();
            }
            if (this.field258.field2214 == 1) {
                this.field255 = (DataInputStream) this.field258.field2217;
                this.field254 = 1;
            }
        }
        if (this.field254 == 1) {
            int var1 = this.field255.available();
            if (var1 > 0) {
                if (this.field256 + var1 > 4) {
                    var1 = 4 - this.field256;
                }
                this.field256 += this.field255.read(this.field253, this.field256, var1);
                if (this.field256 == 4) {
                    int var2 = (new class120(this.field253)).method2360();
                    this.field257 = new byte[var2];
                    this.field254 = 2;
                }
            }
        }
        if (this.field254 == 2) {
            int var3 = this.field255.available();
            if (var3 > 0) {
                if (this.field259 + var3 > this.field257.length) {
                    var3 = this.field257.length - this.field259;
                }
                this.field259 += this.field255.read(this.field257, this.field259, var3);
                if (this.field259 == this.field257.length) {
                    return this.field257;
                }
            }
        }
        return null;
    }
}
