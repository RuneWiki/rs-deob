package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class24 {

    @ObfuscatedName("x.q")
    public int field381;

    @ObfuscatedName("x.c")
    public class79 field377;

    @ObfuscatedName("x.p")
    public DataInputStream field375;

    @ObfuscatedName("x.z")
    public byte[] field372 = new byte[4];

    @ObfuscatedName("x.m")
    public int field376;

    @ObfuscatedName("x.k")
    public byte[] field373;

    @ObfuscatedName("x.v")
    public int field378;

    @ObfuscatedName("x.y")
    public long field379;

    public class24(class74 arg0, URL arg1) {
        this.field377 = arg0.method1519(arg1);
        this.field381 = 0;
        this.field379 = class121.method533() + 30000L;
    }

    @ObfuscatedName("x.q(I)[B")
    public byte[] method211() throws IOException {
        if (class121.method533() > this.field379) {
            throw new IOException();
        }
        if (this.field381 == 0) {
            if (this.field377.field1417 == 2) {
                throw new IOException();
            }
            if (this.field377.field1417 == 1) {
                this.field375 = (DataInputStream) this.field377.field1419;
                this.field381 = 1;
            }
        }
        if (this.field381 == 1) {
            int var1 = this.field375.available();
            if (var1 > 0) {
                if (this.field376 + var1 > 4) {
                    var1 = 4 - this.field376;
                }
                this.field376 += this.field375.read(this.field372, this.field376, var1);
                if (this.field376 == 4) {
                    int var2 = (new class127(this.field372)).method2430();
                    this.field373 = new byte[var2];
                    this.field381 = 2;
                }
            }
        }
        if (this.field381 == 2) {
            int var3 = this.field375.available();
            if (var3 > 0) {
                if (this.field378 + var3 > this.field373.length) {
                    var3 = this.field373.length - this.field378;
                }
                this.field378 += this.field375.read(this.field373, this.field378, var3);
                if (this.field378 == this.field373.length) {
                    return this.field373;
                }
            }
        }
        return null;
    }
}
