select ANIMAL_ID, NAME, DATE_FORMAT(DATETIME,'%Y-%m-%d')
from animal_ins
order by animal_id asc