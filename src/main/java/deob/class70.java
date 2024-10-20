package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bx")
public final class class70 implements Runnable {

    @ObfuscatedName("bx.x")
    public InputStream field1254;

    @ObfuscatedName("bx.p")
    public OutputStream field1250;

    @ObfuscatedName("bx.k")
    public Socket field1251;

    @ObfuscatedName("bx.a")
    public boolean field1252 = false;

    @ObfuscatedName("bx.q")
    public class74 field1253;

    @ObfuscatedName("bx.j")
    public class79 field1259;

    @ObfuscatedName("bx.v")
    public byte[] field1249;

    @ObfuscatedName("bx.w")
    public int field1255 = 0;

    @ObfuscatedName("bx.l")
    public int field1257 = 0;

    @ObfuscatedName("bx.s")
    public boolean field1258 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1253 = arg1;
        this.field1251 = arg0;
        this.field1251.setSoTimeout(30000);
        this.field1251.setTcpNoDelay(true);
        this.field1254 = this.field1251.getInputStream();
        this.field1250 = this.field1251.getOutputStream();
    }

    @ObfuscatedName("bx.k(I)V")
    public void method1352() {
        if (this.field1252) {
            return;
        }
        synchronized (this) {
            this.field1252 = true;
            this.notifyAll();
        }
        if (this.field1259 != null) {
            while (this.field1259.field1379 == 0) {
                class126.method731(1L);
            }
            if (this.field1259.field1379 == 1) {
                try {
                    ((Thread) this.field1259.field1387).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1259 = null;
    }

    public void finalize() {
        this.method1352();
    }

    @ObfuscatedName("bx.a(I)I")
    public int method1354() throws IOException {
        return this.field1252 ? 0 : this.field1254.read();
    }

    @ObfuscatedName("bx.q(I)I")
    public int method1355() throws IOException {
        return this.field1252 ? 0 : this.field1254.available();
    }

    @ObfuscatedName("bx.j([BIIB)V")
    public void method1369(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1252) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1254.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bx.v([BIIB)V")
    public void method1357(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1252) {
            return;
        }
        if (this.field1258) {
            this.field1258 = false;
            throw new IOException();
        }
        if (this.field1249 == null) {
            this.field1249 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1249[this.field1257] = arg0[arg1 + var5];
                this.field1257 = (this.field1257 + 1) % 5000;
                if ((this.field1255 + 4900) % 5000 == this.field1257) {
                    throw new IOException();
                }
            }
            if (this.field1259 == null) {
                this.field1259 = this.field1253.method1458(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1257 == this.field1255) {
                            if (this.field1252) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1255;
                        if (this.field1257 >= this.field1255) {
                            var4 = this.field1257 - this.field1255;
                        } else {
                            var4 = 5000 - this.field1255;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1250.write(this.field1249, var3, var4);
                    } catch (IOException var12) {
                        this.field1258 = true;
                    }
                    this.field1255 = (this.field1255 + var4) % 5000;
                    try {
                        if (this.field1257 == this.field1255) {
                            this.field1250.flush();
                        }
                    } catch (IOException var11) {
                        this.field1258 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1254 != null) {
                        this.field1254.close();
                    }
                    if (this.field1250 != null) {
                        this.field1250.close();
                    }
                    if (this.field1251 != null) {
                        this.field1251.close();
                    }
                } catch (IOException var10) {
                }
                this.field1249 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method2341((String) null, var15);
        }
    }
}
