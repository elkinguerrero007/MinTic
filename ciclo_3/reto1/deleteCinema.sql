BEGIN 
    DELETE FROM CINEMA WHERE ID  =:id;
    :status_code :=204;
END;