package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ib")
public class class230 {

    @ObfuscatedName("ib.aw")
    public Map field2458 = new HashMap();

    @ObfuscatedName("ib.ak")
    public int field2460 = 0;

    @ObfuscatedName("ib.aj")
    public static final class230 field2461 = new class230();

    @ObfuscatedName("av.ap(I)Lib;")
    public static class230 method289() {
        return field2461;
    }

    @ObfuscatedName("ib.aw(Lorg/json/JSONObject;ILex;I)V")
    public void method4345(JSONObject arg0, int arg1, class119 arg2) {
        this.field2458.clear();
        JSONObject var4;
        try {
            var4 = arg0;
            this.field2460 = arg1;
            arg0.getLong("lastfullsyncat");
            arg0.getLong("lastcardupdatedat");
        } catch (Exception var8) {
            return;
        }
        try {
            this.method4359(var4.getJSONArray("crmcomponents"), this.field2460, arg2);
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("ib.ak(Lorg/json/JSONArray;ILex;I)V")
    public void method4359(JSONArray arg0, int arg1, class119 arg2) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            JSONObject var5 = arg0.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
                String var6 = var5.getString("platform");
                if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                    class228 var7 = new class228();
                    try {
                        var7.method4311(var5, arg1, arg2);
                    } catch (Exception var10) {
                    }
                    if (!var7.field2442.isEmpty()) {
                        String var9 = var5.getString("location");
                        this.field2458.put(var9, var7);
                    }
                }
            }
        }
        this.field2458 = this.method4347();
        class330.method2257();
    }

    @ObfuscatedName("ib.aj(S)Ljava/util/Map;")
    public Map method4347() {
        HashMap var1 = new HashMap();
        ArrayList var2 = new ArrayList();
        var2.addAll(this.field2458.entrySet());
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < var2.size() - 1; var4++) {
                if (((class228) ((Entry) var2.get(var4)).getValue()).method4307() > ((class228) ((Entry) var2.get(var4 + 1)).getValue()).method4307()) {
                    Entry var5 = (Entry) var2.get(var4);
                    var2.set(var4, var2.get(var4 + 1));
                    var2.set(var4 + 1, var5);
                    var3 = false;
                }
            }
        }
        Iterator var6 = var2.iterator();
        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            var1.put(var7.getKey(), var7.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ib.ai(Ljava/lang/String;B)Lik;")
    public class228 method4361(String arg0) {
        return (class228) this.field2458.get(arg0);
    }
}
