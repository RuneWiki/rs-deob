package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("em")
public final class class135 implements Runnable {

    @ObfuscatedName("em.n")
    public InputStream field2083;

    @ObfuscatedName("em.d")
    public OutputStream field2084;

    @ObfuscatedName("em.z")
    public Socket field2088;

    @ObfuscatedName("em.y")
    public boolean field2085 = false;

    @ObfuscatedName("em.e")
    public class128 field2087;

    @ObfuscatedName("em.g")
    public class138 field2089;

    @ObfuscatedName("em.f")
    public byte[] field2086;

    @ObfuscatedName("em.m")
    public int field2090 = 0;

    @ObfuscatedName("em.a")
    public int field2091 = 0;

    @ObfuscatedName("em.h")
    public boolean field2092 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2087 = arg1;
        this.field2088 = arg0;
        this.field2088.setSoTimeout(30000);
        this.field2088.setTcpNoDelay(true);
        this.field2083 = this.field2088.getInputStream();
        this.field2084 = this.field2088.getOutputStream();
    }

    @ObfuscatedName("em.z(I)V")
    public void method2720() {
        if (this.field2085) {
            return;
        }
        synchronized (this) {
            this.field2085 = true;
            this.notifyAll();
        }
        if (this.field2089 != null) {
            while (this.field2089.field2118 == 0) {
                class119.method3147(1L);
            }
            if (this.field2089.field2118 == 1) {
                try {
                    ((Thread) this.field2089.field2114).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2089 = null;
    }

    public void finalize() {
        this.method2720();
    }

    @ObfuscatedName("em.y(I)I")
    public int method2722() throws IOException {
        return this.field2085 ? 0 : this.field2083.read();
    }

    @ObfuscatedName("em.e(B)I")
    public int method2723() throws IOException {
        return this.field2085 ? 0 : this.field2083.available();
    }

    @ObfuscatedName("em.g([BIIB)V")
    public void method2724(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2085) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2083.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("em.f([BIII)V")
    public void method2725(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2085) {
            return;
        }
        if (this.field2092) {
            this.field2092 = false;
            throw new IOException();
        }
        if (this.field2086 == null) {
            this.field2086 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2086[this.field2091] = arg0[arg1 + var5];
                this.field2091 = (this.field2091 + 1) % 5000;
                if ((this.field2090 + 4900) % 5000 == this.field2091) {
                    throw new IOException();
                }
            }
            if (this.field2089 == null) {
                this.field2089 = this.field2087.method2624(this, 3);
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
                        if (this.field2091 == this.field2090) {
                            if (this.field2085) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2090;
                        if (this.field2091 >= this.field2090) {
                            var4 = this.field2091 - this.field2090;
                        } else {
                            var4 = 5000 - this.field2090;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2084.write(this.field2086, var3, var4);
                    } catch (IOException var12) {
                        this.field2092 = true;
                    }
                    this.field2090 = (this.field2090 + var4) % 5000;
                    try {
                        if (this.field2091 == this.field2090) {
                            this.field2084.flush();
                        }
                    } catch (IOException var11) {
                        this.field2092 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2083 != null) {
                        this.field2083.close();
                    }
                    if (this.field2084 != null) {
                        this.field2084.close();
                    }
                    if (this.field2088 != null) {
                        this.field2088.close();
                    }
                } catch (IOException var10) {
                }
                this.field2086 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method1864((String) null, var15);
        }
    }
}
