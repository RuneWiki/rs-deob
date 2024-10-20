package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fp")
public final class class160 implements Runnable {

    @ObfuscatedName("fp.i")
    public OutputStream field2294;

    @ObfuscatedName("fp.c")
    public InputStream field2290;

    @ObfuscatedName("fp.e")
    public Socket field2301;

    @ObfuscatedName("fp.v")
    public boolean field2293 = false;

    @ObfuscatedName("fp.b")
    public class155 field2300;

    @ObfuscatedName("fp.y")
    public class154 field2295;

    @ObfuscatedName("fp.h")
    public byte[] field2296;

    @ObfuscatedName("fp.x")
    public int field2297 = 0;

    @ObfuscatedName("fp.f")
    public int field2298 = 0;

    @ObfuscatedName("fp.n")
    public boolean field2299 = false;

    public class160(Socket arg0, class155 arg1) throws IOException {
        this.field2300 = arg1;
        this.field2301 = arg0;
        this.field2301.setSoTimeout(30000);
        this.field2301.setTcpNoDelay(true);
        this.field2301.setReceiveBufferSize(16384);
        this.field2301.setSendBufferSize(16384);
        this.field2290 = this.field2301.getInputStream();
        this.field2294 = this.field2301.getOutputStream();
    }

    @ObfuscatedName("fp.i(I)V")
    public void method2716() {
        if (this.field2293) {
            return;
        }
        synchronized (this) {
            this.field2293 = true;
            this.notifyAll();
        }
        if (this.field2295 != null) {
            while (this.field2295.field2245 == 0) {
                class182.method10(1L);
            }
            if (this.field2295.field2245 == 1) {
                try {
                    ((Thread) this.field2295.field2249).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2295 = null;
    }

    public void finalize() {
        this.method2716();
    }

    @ObfuscatedName("fp.c(B)I")
    public int method2718() throws IOException {
        return this.field2293 ? 0 : this.field2290.read();
    }

    @ObfuscatedName("fp.e(B)I")
    public int method2735() throws IOException {
        return this.field2293 ? 0 : this.field2290.available();
    }

    @ObfuscatedName("fp.v([BIIB)V")
    public void method2720(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2293) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2290.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fp.b([BIII)V")
    public void method2733(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2293) {
            return;
        }
        if (this.field2299) {
            this.field2299 = false;
            throw new IOException();
        }
        if (this.field2296 == null) {
            this.field2296 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2296[this.field2298] = arg0[arg1 + var5];
                this.field2298 = (this.field2298 + 1) % 5000;
                if ((this.field2297 + 4900) % 5000 == this.field2298) {
                    throw new IOException();
                }
            }
            if (this.field2295 == null) {
                this.field2295 = this.field2300.method2683(this, 3);
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
                        if (this.field2298 == this.field2297) {
                            if (this.field2293) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2297;
                        if (this.field2298 >= this.field2297) {
                            var4 = this.field2298 - this.field2297;
                        } else {
                            var4 = 5000 - this.field2297;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2294.write(this.field2296, var3, var4);
                    } catch (IOException var12) {
                        this.field2299 = true;
                    }
                    this.field2297 = (this.field2297 + var4) % 5000;
                    try {
                        if (this.field2298 == this.field2297) {
                            this.field2294.flush();
                        }
                    } catch (IOException var11) {
                        this.field2299 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2290 != null) {
                        this.field2290.close();
                    }
                    if (this.field2294 != null) {
                        this.field2294.close();
                    }
                    if (this.field2301 != null) {
                        this.field2301.close();
                    }
                } catch (IOException var10) {
                }
                this.field2296 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method131((String) null, var15);
        }
    }
}
