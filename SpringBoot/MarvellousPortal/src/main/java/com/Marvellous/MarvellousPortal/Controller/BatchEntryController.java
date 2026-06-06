package com.Marvellous.MarvellousPortal.Controller;


import com.Marvellous.MarvellousPortal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/Batches")
public class BatchEntryController
{
  private HashMap<Long , BatchEntry> batchentries=new HashMap<Long , BatchEntry>();


  //Select * from Batches
  @GetMapping
  public ArrayList<BatchEntry>getAll()
  {
     return new ArrayList<>(batchentries.values());
  }


  //Insert into Batches (1,"PPA",28000);
  @PostMapping
    public String CreateEntry(@RequestBody BatchEntry myEntry)
  {
      batchentries.put(myEntry.getId(),myEntry);
      return "Data inserted Sucessfully";
  }

  @DeleteMapping
    public void  deleteEntryById(@PathVariable Long myid)
  {
      batchentries.remove(myid);
  }

  @PutMapping("/id/{myid}")
    public void updateEntryById(@PathVariable Long myid,@RequestBody BatchEntry myEntry)
  {
      batchentries.put(myEntry.getId(),myEntry);
  }

}
