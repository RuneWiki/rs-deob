package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("m")
public class class19 {

    @ObfuscatedName("m.k")
    public int field250;

    @ObfuscatedName("m.h")
    public class146 field248;

    @ObfuscatedName("m.o")
    public DataInputStream field258;

    @ObfuscatedName("m.z")
    public byte[] field251 = new byte[4];

    @ObfuscatedName("m.c")
    public int field252;

    @ObfuscatedName("m.d")
    public byte[] field253;

    @ObfuscatedName("m.l")
    public int field254;

    @ObfuscatedName("m.b")
    public long field266;

    public class19(class136 arg0, URL arg1) {
        this.field248 = arg0.method2704(arg1);
        this.field250 = 0;
        this.field266 = class115.method124() + 30000L;
    }

    @ObfuscatedName("m.k(S)[B")
    public byte[] method187() throws IOException {
        if (class115.method124() > this.field266) {
            throw new IOException();
        }
        if (this.field250 == 0) {
            if (this.field248.field2195 == 2) {
                throw new IOException();
            }
            if (this.field248.field2195 == 1) {
                this.field258 = (DataInputStream) this.field248.field2197;
                this.field250 = 1;
            }
        }
        if (this.field250 == 1) {
            int var1 = this.field258.available();
            if (var1 > 0) {
                if (this.field252 + var1 > 4) {
                    var1 = 4 - this.field252;
                }
                this.field252 += this.field258.read(this.field251, this.field252, var1);
                if (this.field252 == 4) {
                    int var2 = (new class119(this.field251)).method2415();
                    this.field253 = new byte[var2];
                    this.field250 = 2;
                }
            }
        }
        if (this.field250 == 2) {
            int var3 = this.field258.available();
            if (var3 > 0) {
                if (this.field254 + var3 > this.field253.length) {
                    var3 = this.field253.length - this.field254;
                }
                this.field254 += this.field258.read(this.field253, this.field254, var3);
                if (this.field254 == this.field253.length) {
                    return this.field253;
                }
            }
        }
        return null;
    }
}
