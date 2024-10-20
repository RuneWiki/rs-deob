package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("es")
public final class class147 implements Runnable {

    @ObfuscatedName("es.l")
    public InputStream field2241;

    @ObfuscatedName("es.g")
    public OutputStream field2249;

    @ObfuscatedName("es.r")
    public Socket field2240;

    @ObfuscatedName("es.e")
    public boolean field2242 = false;

    @ObfuscatedName("es.h")
    public class140 field2243;

    @ObfuscatedName("es.s")
    public class150 field2244;

    @ObfuscatedName("es.k")
    public byte[] field2245;

    @ObfuscatedName("es.u")
    public int field2246 = 0;

    @ObfuscatedName("es.n")
    public int field2239 = 0;

    @ObfuscatedName("es.b")
    public boolean field2248 = false;

    public class147(Socket arg0, class140 arg1) throws IOException {
        this.field2243 = arg1;
        this.field2240 = arg0;
        this.field2240.setSoTimeout(30000);
        this.field2240.setTcpNoDelay(true);
        this.field2240.setReceiveBufferSize(16384);
        this.field2240.setSendBufferSize(16384);
        this.field2241 = this.field2240.getInputStream();
        this.field2249 = this.field2240.getOutputStream();
    }

    @ObfuscatedName("es.r(I)V")
    public void method2977() {
        if (this.field2242) {
            return;
        }
        synchronized (this) {
            this.field2242 = true;
            this.notifyAll();
        }
        if (this.field2244 != null) {
            while (this.field2244.field2277 == 0) {
                class131.method587(1L);
            }
            if (this.field2244.field2277 == 1) {
                try {
                    ((Thread) this.field2244.field2273).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2244 = null;
    }

    public void finalize() {
        this.method2977();
    }

    @ObfuscatedName("es.e(I)I")
    public int method2986() throws IOException {
        return this.field2242 ? 0 : this.field2241.read();
    }

    @ObfuscatedName("es.h(I)I")
    public int method2987() throws IOException {
        return this.field2242 ? 0 : this.field2241.available();
    }

    @ObfuscatedName("es.s([BIII)V")
    public void method2978(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2242) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2241.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("es.k([BIII)V")
    public void method2981(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2242) {
            return;
        }
        if (this.field2248) {
            this.field2248 = false;
            throw new IOException();
        }
        if (this.field2245 == null) {
            this.field2245 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2245[this.field2239] = arg0[arg1 + var5];
                this.field2239 = (this.field2239 + 1) % 5000;
                if ((this.field2246 + 4900) % 5000 == this.field2239) {
                    throw new IOException();
                }
            }
            if (this.field2244 == null) {
                this.field2244 = this.field2243.method2880(this, 3);
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
                        if (this.field2246 == this.field2239) {
                            if (this.field2242) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2246;
                        if (this.field2239 >= this.field2246) {
                            var4 = this.field2239 - this.field2246;
                        } else {
                            var4 = 5000 - this.field2246;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2249.write(this.field2245, var3, var4);
                    } catch (IOException var12) {
                        this.field2248 = true;
                    }
                    this.field2246 = (this.field2246 + var4) % 5000;
                    try {
                        if (this.field2246 == this.field2239) {
                            this.field2249.flush();
                        }
                    } catch (IOException var11) {
                        this.field2248 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2241 != null) {
                        this.field2241.close();
                    }
                    if (this.field2249 != null) {
                        this.field2249.close();
                    }
                    if (this.field2240 != null) {
                        this.field2240.close();
                    }
                } catch (IOException var10) {
                }
                this.field2245 = null;
                break;
            }
        } catch (Exception var15) {
            class152.method169((String) null, var15);
        }
    }
}
